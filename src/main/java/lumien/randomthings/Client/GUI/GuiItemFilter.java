package lumien.randomthings.Client.GUI;

import lumien.randomthings.Client.GUI.Elements.Buttons.GuiButtonBooleanProperty;
import lumien.randomthings.Client.GUI.Elements.Buttons.GuiButtonListtype;
import lumien.randomthings.Container.ContainerItemFilter;
import lumien.randomthings.Items.ModItems;
import lumien.randomthings.Library.ClientUtil;
import lumien.randomthings.Network.PacketHandler;
import lumien.randomthings.Network.Messages.MessageItemFilter;
import lumien.randomthings.Network.Messages.MessageItemFilter.ACTION;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiItemFilter extends GuiContainer {
    final ResourceLocation background = new ResourceLocation("randomthings:textures/gui/itemFilter.png");
    EntityPlayer player;
    ItemStack itemFilter;
    GuiButtonBooleanProperty oreDictButton;
    GuiButtonBooleanProperty metadataButton;
    GuiButtonListtype listTypeButton;

    public GuiItemFilter(ItemStack filter, EntityPlayer player, IInventory inventoryPlayer, IInventory inventoryFilter) {
        super(new ContainerItemFilter(filter, inventoryPlayer, inventoryFilter));
        this.xSize = 220;
        this.ySize = 133;
        this.player = player;
        this.itemFilter = player.getCurrentEquippedItem();
    }

    public void initGui() {
        super.initGui();
        this.metadataButton = new GuiButtonBooleanProperty(this, "metadata", Item.getIdFromItem(ModItems.filter), 1, this.player.inventory.currentItem, 0, this.guiLeft + 195, this.guiTop + 4, new ResourceLocation("randomthings:textures/gui/buttonMetadata.png"), ClientUtil.translate("text.miscellaneous.useMetadata"), ClientUtil.translate("text.miscellaneous.ignoreMetadata"));
        this.metadataButton.setValue(this.itemFilter.stackTagCompound.getBoolean("metadata"));
        this.buttonList.add(this.metadataButton);
        this.oreDictButton = new GuiButtonBooleanProperty(this, "oreDict", Item.getIdFromItem(ModItems.filter), 1, this.player.inventory.currentItem, 0, this.guiLeft + 173, this.guiTop + 4, new ResourceLocation("randomthings:textures/gui/buttonOreDict.png"), ClientUtil.translate("text.miscellaneous.useOreDict"), ClientUtil.translate("text.miscellaneous.ignoreOreDict"));
        this.oreDictButton.setValue(this.itemFilter.stackTagCompound.getBoolean("oreDict"));
        this.buttonList.add(this.oreDictButton);
        this.listTypeButton = new GuiButtonListtype(this, 1, this.guiLeft + 173, this.guiTop + 4 + 22, this.itemFilter.stackTagCompound.getInteger("listType"));
        this.buttonList.add(this.listTypeButton);
    }

    protected void actionPerformed(GuiButton pressedButton) {
        if (pressedButton == this.listTypeButton) {
            int type = this.listTypeButton.getType();
            this.listTypeButton.setType(type == 0 ? 1 : 0);
            PacketHandler.INSTANCE.sendToServer(new MessageItemFilter(ACTION.LISTTYPE));
        }

    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        this.mc.renderEngine.bindTexture(this.background);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int x = (this.width - this.xSize) / 2;
        int y = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
    }
}
