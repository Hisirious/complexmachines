package archadia.complexmachines.common.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import archadia.complexmachines.common.container.ContainerAlloyFabricator;
import archadia.complexmachines.common.tileentity.TileEntityAlloyFabricator;

/**
 * @author Archadia
 *
 */
public class GuiAlloyFabricator extends GuiContainer {
	    private TileEntityAlloyFabricator tileINV;

	    public GuiAlloyFabricator(InventoryPlayer par1InventoryPlayer, TileEntityAlloyFabricator tile)
	    {
	        super(new ContainerAlloyFabricator(par1InventoryPlayer, tile));
	        this.tileINV = tile;
	    }

	    protected void drawGuiContainerForegroundLayer(int par1, int par2)
	    {
	       // this.fontRenderer.drawString("Alloy Fabricator", this.xSize / 2, 72, 4210752);
	    }

	    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	    {
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.func_110434_K().func_110577_a(new ResourceLocation("modech","textures/gui/alloyfab.png"));
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	    }
}
