package lumien.randomthings.Container;

import lumien.randomthings.Container.Slots.SlotLocked;
import lumien.randomthings.Items.ItemFilter;
import lumien.randomthings.Items.ItemFilter.FilterType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerItemFilter extends Container {
    IInventory filterInventory;
    ItemStack filter;

    public ContainerItemFilter(ItemStack filter, IInventory playerInventory, IInventory filterInventory) {
        this.filterInventory = filterInventory;
        filterInventory.openInventory();

        for(int row = 0; row < 2; ++row) {
            for(int col = 0; col < 9; ++col) {
                this.addSlotToContainer(new Slot(filterInventory, col + row * 9, 8 + col * 18, 8 + row * 18));
            }
        }

        this.bindPlayerInventory((InventoryPlayer)playerInventory);
    }

    public ItemStack slotClick(int par1, int par2, int par3, EntityPlayer par4EntityPlayer) {
        if (par1 < 18 && par1 >= 0) {
            if (par4EntityPlayer.inventory.getItemStack() != null) {
                ItemStack holdItem = par4EntityPlayer.inventory.getItemStack().copy();
                holdItem.stackSize = 1;
                this.filterInventory.setInventorySlotContents(par1, holdItem);
            } else {
                this.filterInventory.setInventorySlotContents(par1, (ItemStack)null);
            }

            return null;
        } else {
            return super.slotClick(par1, par2, par3, par4EntityPlayer);
        }
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        return null;
    }

    public boolean mergeItemStack(ItemStack par1ItemStack, int par2, int par3, boolean par4) {
        return false;
    }

    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        int i;
        for(i = 0; i < 3; ++i) {
            for(int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 51 + i * 18));
            }
        }

        for(i = 0; i < 9; ++i) {
            if (inventoryPlayer.getStackInSlot(i) == inventoryPlayer.player.getCurrentEquippedItem()) {
                this.addSlotToContainer(new SlotLocked(inventoryPlayer, i, 8 + i * 18, 109));
            } else {
                this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 109));
            }
        }

    }

    public boolean canInteractWith(EntityPlayer entityplayer) {
        return entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().getItem() instanceof ItemFilter && ItemFilter.getFilterType(entityplayer.getCurrentEquippedItem().getItemDamage()) == FilterType.ITEM;
    }
}
