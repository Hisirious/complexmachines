package archadia.complexmachines.common.item;

import archadia.complexmachines.common.ComplexMachines;
import archadia.complexmachines.common.helper.ArchLoader;
import net.minecraft.item.Item;

/**
 * @author Archadia
 *
 */
public class ItemIngot extends ItemBase {

	public ItemIngot(int id, String name) {
		super(id, name);
		setCreativeTab(ComplexMachines.tabComplexMachines);
		setUnlocalizedName(name);
		addToLibrary(this);
	}
	
	public void addToLibrary(Item i) {
		ArchLoader.ingotLibrary.add(i);
	}
}