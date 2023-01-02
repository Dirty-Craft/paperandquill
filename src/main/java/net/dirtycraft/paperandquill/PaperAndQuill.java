package net.dirtycraft.paperandquill;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaperAndQuill implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("paper-and-quill");

	public static final PaperAndQuillItem PAPER_AND_QUILL_ITEM = Registry.register(
			Registry.ITEM,
			new Identifier("paper_and_quill", "paper_and_quill"),
			new PaperAndQuillItem(new FabricItemSettings().group(ItemGroup.MISC))
	);

	@Override
	public void onInitialize() {
		//
	}
}
