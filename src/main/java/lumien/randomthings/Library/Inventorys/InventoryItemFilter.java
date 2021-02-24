package lumien.randomthings.Library.Inventorys;

import lumien.randomthings.Items.ItemFilter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class InventoryItemFilter extends InventoryBasic {
    private EntityPlayer playerEntity;
    private ItemStack originalIS;
    private boolean reading = false;

    public InventoryItemFilter(EntityPlayer player, ItemStack is) {
        super("Item Filter", false, 18);
        this.playerEntity = player;
        this.originalIS = is;
        if (!this.hasInventory()) {
            this.createInventory();
        }
    }

    public void markDirty() {
        super.markDirty();
        if (!this.reading) {
            this.saveInventory();
        }
    }

    public void openInventory() {
        this.loadInventory();
    }

    public void closeInventory() {
        this.saveInventory();
    }

    public String getInventoryName() {
        return "Item Filter";
    }

    private boolean hasInventory() {
        return this.originalIS.stackTagCompound.getTag("Inventory") != null;
    }

    private void createInventory() {
        this.writeToNBT();
    }

    public void loadInventory() {
        this.readFromNBT();
    }

    protected void setNBT() {
        ItemStack itemStack = this.playerEntity.getCurrentEquippedItem();
        if (itemStack.getItem() instanceof ItemFilter && itemStack.getItemDamage() == 1) {
            itemStack.setTagCompound(this.originalIS.getTagCompound());
        }

    }

    public void saveInventory() {
        this.writeToNBT();
        this.setNBT();
    }

    protected void writeToNBT() {
        NBTTagList itemList = new NBTTagList();

        for(int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) != null) {
                NBTTagCompound slotEntry = new NBTTagCompound();
                slotEntry.setByte("Slot", (byte)i);
                this.getStackInSlot(i).writeToNBT(slotEntry);
                itemList.appendTag(slotEntry);
            }
        }

        NBTTagCompound inventory = new NBTTagCompound();
        inventory.setTag("Items", itemList);
        this.originalIS.stackTagCompound.setTag("Inventory", inventory);
    }

    protected void readFromNBT() {
        this.reading = true;
        NBTTagList itemList = (NBTTagList)((NBTTagCompound)this.originalIS.stackTagCompound.getTag("Inventory")).getTag("Items");

        for(int i = 0; i < itemList.tagCount(); ++i) {
            NBTTagCompound slotEntry = itemList.getCompoundTagAt(i);
            int j = slotEntry.getByte("Slot") & 255;
            if (j >= 0 && j < this.getSizeInventory()) {
                this.setInventorySlotContents(j, ItemStack.loadItemStackFromNBT(slotEntry));
            }
        }

        this.reading = false;
    }
}
