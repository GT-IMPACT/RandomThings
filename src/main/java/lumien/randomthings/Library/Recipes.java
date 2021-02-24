package lumien.randomthings.Library;

import cpw.mods.fml.common.registry.GameRegistry;
import lumien.randomthings.Blocks.ModBlocks;
import lumien.randomthings.Configuration.ConfigBlocks;
import lumien.randomthings.Configuration.ConfigItems;
import lumien.randomthings.Handler.ImbuingStation.ImbuingRecipeHandler;
import lumien.randomthings.Items.ItemFilter;
import lumien.randomthings.Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    static ItemStack iObsidian = new ItemStack(Block.getBlockFromName("obsidian"));
    static ItemStack iEnderChest;
    static ItemStack iNetherstar;
    static ItemStack iEmerald;
    static ItemStack iGlassBottle;
    static ItemStack iDirt;
    static ItemStack iBonemeal;
    static ItemStack iRottenflesh;
    static ItemStack iHopper;
    static ItemStack iEnderPearl;
    static ItemStack iDiamond;
    static ItemStack iPaper;
    static ItemStack iRedstoneTorch;
    static ItemStack iRedstoneRepeater;
    static ItemStack iLeather;
    static ItemStack iString;
    static ItemStack iFlint;
    static ItemStack iSnowball;
    static ItemStack iQuartz;
    static ItemStack iSoulSand;
    static ItemStack iLever;
    static ItemStack iSeed;
    static ItemStack iWaterBottle;
    static ItemStack iRedMushroom;
    static ItemStack iBlazePowder;
    static ItemStack iNetherBrick;
    static ItemStack iGoldIngot;
    static ItemStack iBlazeRod;
    static ItemStack iWitherSkull;
    static ItemStack iBone;
    static ItemStack iCoal;
    static ItemStack iQuartzBlock;
    static ItemStack iGhastTear;
    static ItemStack iDaisy;
    static ItemStack iLapisBlock;
    static ItemStack iVine;
    static ItemStack iCauldron;
    static ItemStack iTallGrass;
    static ItemStack iLilypad;
    static ItemStack imbuePoison;
    static ItemStack imbueExperience;
    static ItemStack imbueFire;
    static ItemStack imbueWither;
    static ItemStack imbueWeakness;
    static ItemStack imbueSpectre;
    static ItemStack iPlayerCore;
    static ItemStack iObsidianStick;
    static ItemStack iEnderFragment;
    static ItemStack iEctoplasm;
    static ItemStack iSpectreIron;
    static ItemStack iEnderDiamond;
    static ItemStack iEnergizedWater;
    static ItemStack iTransformationCore;
    static ItemStack iSpiderEye;
    static ItemStack iAllium;

    public Recipes() {
    }

    public static void init() {
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.imbuingStation), new Object[]{"vcv", "tgt", "lel", 'v', iVine, 'c', iCauldron, 't', iTallGrass, 'g', new ItemStack(Blocks.stained_hardened_clay, 1, 13), 'l', iLilypad, 'e', "blockEmerald"}));
        //GameRegistry.addRecipe(new ShapedOreRecipe(iPlayerCore, new Object[]{"xlx", "lel", "xlx", 'l', "gemLapis", 'e', "gemEmerald"}));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingredients, 3, 1), new Object[]{"o", "o", 'o', iObsidian}));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingredients, 4, 2), new Object[]{"fe", 'e', iEnderPearl, 'f', iFlint}));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingredients, 1, 4), new Object[]{"ei", 'e', iEctoplasm, 'i', "ingotIron"}));
//        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingredients, 1, 5), new Object[]{"dyeRed", "dyeOrange", "dyeYellow", "dyeGreen", "dyeCyan", "dyePurple", "dyeGray", "dyeLime", "dyeMagenta"}));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingredients, 1, 6), new Object[]{"xex", "ede", "xex", 'e', iEnderPearl, 'd', "gemDiamond"}));
//        if (ConfigBlocks.playerInterface) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.playerInterface), new Object[]{"oeo", "omo", "ono", 'o', iObsidian, 'e', iEnderChest, 'm', iPlayerCore, 'n', iNetherstar}));
//        }

//        if (ConfigBlocks.fluidDisplay) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.fluidDisplay, 8), new Object[]{"ggg", "gbg", "ggg", 'g', "paneGlass", 'b', iGlassBottle}));
//            GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.advancedFluidDisplay, new Object[]{ModBlocks.fluidDisplay, "gemLapis"}));
//        }

//        if (ConfigBlocks.fertilizedDirt) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.fertilizedDirt, 1), new Object[]{"brb", "rdr", "brb", 'b', iBonemeal, 'r', iRottenflesh, 'd', iDirt}));
//        }

//        if (ConfigBlocks.itemCollector) {
//            ItemStack iItemCollector = new ItemStack(ModBlocks.itemCollector);
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.itemCollector, 1), "xhx", "rer", "xox", 'h', iHopper, 'r', "dustRedstone", 'e', iEnderPearl, 'o', "stickObsidian"));
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.advancedItemCollector, 1), "xdx", "gig", 'd', "gemDiamond", 'g', "dustGlowstone", 'i', iItemCollector));
//        }

//        if (ConfigBlocks.onlineDetector) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.onlineDetector, 1), new Object[]{"sts", "rer", "sts", 's', "stone", 't', iRedstoneTorch, 'r', "dustRedstone", 'e', "gemLapis"}));
//        }
//
//        if (ConfigBlocks.moonSensor) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.moonSensor, 1), new Object[]{"ggg", "lql", "sss", 'g', "blockGlass", 'l', "gemLapis", 's', "slabWood", 'q', "gemQuartz"}));
//        }

//        if (ConfigBlocks.lapisLamp) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.spectreLamp, 4, 0), new Object[]{"isi", "sls", "isi", 's', "blockGlass", 'i', "ingotIron", 'l', "gemLapis"}));
//        }

//        if (ConfigBlocks.wirelessLever) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wirelessLever), new Object[]{"r", "l", 'r', "blockRedstone", 'l', iLever}));
//        }

//        if (ConfigBlocks.dyeingMachine) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.dyeingMachine), new Object[]{"wpw", "ptp", "wpw", 'w', new ItemStack(Blocks.wool, 1, 32767), 'p', "plankWood", 't', iTransformationCore}));
//        }

//        if (ConfigBlocks.spectreGlass) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.spectreGlass, 16, 0), new Object[]{"ggg", "geg", "ggg", 'g', "blockGlass", 'e', iEctoplasm}));
//        }

//        if (ConfigBlocks.energyDistributor) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.energyDistributor), new Object[]{"iri", "beb", "iri", 'i', "blockIron", 'b', "blockRedstone", 'r', iRedstoneRepeater, 'e', iEnergizedWater}));
//        }

//        if (ConfigBlocks.enderEnergyDistributor && ConfigBlocks.energyDistributor) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.enderEnergyDistributor), new Object[]{"ede", "dsd", "ede", 'd', iEnderDiamond, 's', new ItemStack(ModBlocks.energyDistributor)}));
//        }

//        if (ConfigBlocks.bloodMoonSensor) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.bloodMoonSensor), new Object[]{"ggg", "rqr", "sss", 'g', "blockGlass", 'r', "dustRedstone", 's', "slabWood", 'q', "gemQuartz"}));
//        }

//        if (ConfigItems.voidStone) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.voidStone, 1), new Object[]{"xox", "oeo", "xox", 'o', "stone", 'e', iEnderPearl}));
//        }

        if (ConfigItems.dropFilter) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dropFilter, 1, 0), "lsl", "sfs", "lsl", 'l', iLeather, 's', iString, 'f', iFlint));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dropFilter, 1, 1), "fe", 'f', new ItemStack(ModItems.dropFilter, 1, 0), 'e', GameRegistry.findItem("ExtraUtilities", "trashcan")));
        }

//        if (ConfigItems.enderLetter) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderLetter, 1, 0), new Object[]{"fpl", 'f', iEnderFragment, 'p', iPaper, 'l', iLeather}));
//        }
//
//        if (ConfigItems.spectreArmor) {
//            addArmorRecipes(iSpectreIron, new ItemStack(ModItems.spectreHelmet), new ItemStack(ModItems.spectreChestplate), new ItemStack(ModItems.spectreLeggings), new ItemStack(ModItems.spectreBoots));
//        }
//
//        if (ConfigItems.spectreSword) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spectreSword), new Object[]{"xsx", "xsx", "xox", 's', iSpectreIron, 'o', "stickObsidian"}));
//        }

//        if (ConfigItems.spectreKey) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spectreKey), new Object[]{"xsx", "xtx", 's', iSpectreIron, 't', "stickWood"}));
//        }

//        if (ConfigItems.magneticForce) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.magneticForce), new Object[]{"xex", "xmx", "xpx", 'e', iEnderPearl, 'm', "gemEmerald", 'p', iPaper}));
//        }

//        if (ConfigItems.spiritBinder) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spiritBinder), new Object[]{"ses", "ene", "ses", 's', iEctoplasm, 'e', iEnderPearl, 'n', iNetherstar}));
//        }

//        if (ConfigItems.soundRecorder) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.soundRecorder), new Object[]{"xrx", "wiw", "wiw", 'r', iRedstoneTorch, 'w', "plankWood", 'i', "ingotIron"}));
//        }

//        if (ConfigItems.biomeCapsule) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.biomeCapsule), new Object[]{"dte", "qgq", "ooo", 'd', "blockDiamond", 'e', "gemEmerald", 't', iTransformationCore, 'q', "gemQuartz", 'g', "blockGlass", 'o', iObsidian}));
//        }

//        if (ConfigItems.biomePainter) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.biomePainter), new Object[]{"xtx", "xwx", "xox", 't', iTransformationCore, 'w', new ItemStack(Blocks.wool, 1, 32767), 'o', "stickObsidian"}));
//        }
//
//        if (ConfigItems.ginto) {
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ginto, 1, 0), new Object[]{"ixi", "xsx", 'i', "ingotIron", 's', iSpectreIron, 'e', iEctoplasm}));
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ginto, 1, 1), new Object[]{"xex", "xgx", 'e', iEctoplasm, 'g', new ItemStack(ModItems.ginto, 1, 0)}));
//        }

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.filter, 1, 0), "xrx", "rpr", "xrx", 'r', "dyeRed", 'p', iPaper));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemFilter.standardItemFilter, "xrx", "rpr", "xrx", 'r', "dyeYellow", 'p', iPaper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.filter, 1, 2), "xrx", "rpr", "xrx", 'r', "dyeBlue", 'p', iPaper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.filter, 1, 3), "xrx", "rpr", "xrx", 'r', "dyePurple", 'p', iPaper));
        addImbuingRecipes();
    }

    private static void addImbuingRecipes() {
//        if (ConfigItems.imbue) {
//            ImbuingRecipeHandler.addRecipe(iSpiderEye, iAllium, iRedMushroom, iWaterBottle, imbuePoison);
//            ImbuingRecipeHandler.addRecipe(iDiamond, iEmerald, iGoldIngot, iWaterBottle, imbueExperience);
//            ImbuingRecipeHandler.addRecipe(iFlint, iBlazeRod, iNetherBrick, iWaterBottle, imbueFire);
//            ImbuingRecipeHandler.addRecipe(iWitherSkull, iBone, iCoal, iWaterBottle, imbueWither);
//            ImbuingRecipeHandler.addRecipe(iRottenflesh, iQuartzBlock, iGhastTear, iWaterBottle, imbueWeakness);
//            ImbuingRecipeHandler.addRecipe(iEctoplasm, iLapisBlock, iDaisy, iWaterBottle, imbueSpectre);
//        }
//
//        ImbuingRecipeHandler.addRecipe(new ItemStack(Items.gunpowder), new ItemStack(Items.glowstone_dust), new ItemStack(Items.redstone), iWaterBottle, new ItemStack(ModItems.ingredients, 1, 7));
    }

    private static void addArmorRecipes(ItemStack material, ItemStack helmet, ItemStack chestPlate, ItemStack leggings, ItemStack boots) {
//        GameRegistry.addRecipe(helmet, new Object[]{"mmm", "mxm", 'm', material});
//        GameRegistry.addRecipe(chestPlate, new Object[]{"mxm", "mmm", "mmm", 'm', material});
//        GameRegistry.addRecipe(leggings, new Object[]{"mmm", "mxm", "mxm", 'm', material});
//        GameRegistry.addRecipe(boots, new Object[]{"mxm", "mxm", 'm', material});
    }

    static {
        iEnderChest = new ItemStack(Blocks.ender_chest);
        iNetherstar = new ItemStack(Items.nether_star);
        iEmerald = new ItemStack(Items.emerald);
        iGlassBottle = new ItemStack(Items.glass_bottle);
        iDirt = new ItemStack(Blocks.dirt);
        iBonemeal = new ItemStack(Items.dye, 1, 15);
        iRottenflesh = new ItemStack(Items.rotten_flesh);
        iHopper = new ItemStack(Blocks.hopper);
        iEnderPearl = new ItemStack(Items.ender_pearl);
        iDiamond = new ItemStack(Items.diamond);
        iPaper = new ItemStack(Items.paper);
        iRedstoneTorch = new ItemStack(Blocks.redstone_torch);
        iRedstoneRepeater = new ItemStack(Items.repeater);
        iLeather = new ItemStack(Items.leather);
        iString = new ItemStack(Items.string);
        iFlint = new ItemStack(Items.flint);
        iSnowball = new ItemStack(Items.snowball);
        iQuartz = new ItemStack(Items.quartz);
        iSoulSand = new ItemStack(Blocks.soul_sand);
        iLever = new ItemStack(Blocks.lever);
        iSeed = new ItemStack(Items.wheat_seeds);
        iWaterBottle = new ItemStack(Items.potionitem, 1, 0);
        iRedMushroom = new ItemStack(Blocks.red_mushroom, 1, 0);
        iBlazePowder = new ItemStack(Items.blaze_powder, 1, 0);
        iNetherBrick = new ItemStack(Blocks.nether_brick, 1, 0);
        iGoldIngot = new ItemStack(Items.gold_ingot, 1, 0);
        iBlazeRod = new ItemStack(Items.blaze_rod);
        iWitherSkull = new ItemStack(Items.skull, 1, 1);
        iBone = new ItemStack(Items.bone);
        iCoal = new ItemStack(Items.coal);
        iQuartzBlock = new ItemStack(Blocks.quartz_block);
        iGhastTear = new ItemStack(Items.ghast_tear);
        iDaisy = new ItemStack(Blocks.red_flower, 1, 8);
        iLapisBlock = new ItemStack(Blocks.lapis_block, 1, 0);
        iVine = new ItemStack(Blocks.vine);
        iCauldron = new ItemStack(Items.cauldron);
        iTallGrass = new ItemStack(Blocks.tallgrass, 1, 1);
        iLilypad = new ItemStack(Blocks.waterlily);
        imbuePoison = new ItemStack(ModItems.imbue, 1, 0);
        imbueExperience = new ItemStack(ModItems.imbue, 1, 1);
        imbueFire = new ItemStack(ModItems.imbue, 1, 2);
        imbueWither = new ItemStack(ModItems.imbue, 1, 3);
        imbueWeakness = new ItemStack(ModItems.imbue, 1, 4);
        imbueSpectre = new ItemStack(ModItems.imbue, 1, 5);
        iPlayerCore = new ItemStack(ModItems.ingredients, 1, 0);
        iObsidianStick = new ItemStack(ModItems.ingredients, 1, 1);
        iEnderFragment = new ItemStack(ModItems.ingredients, 1, 2);
        iEctoplasm = new ItemStack(ModItems.ingredients, 1, 3);
        iSpectreIron = new ItemStack(ModItems.ingredients, 1, 4);
        iEnderDiamond = new ItemStack(ModItems.ingredients, 1, 6);
        iEnergizedWater = new ItemStack(ModItems.ingredients, 1, 7);
        iTransformationCore = new ItemStack(ModItems.ingredients, 1, 5);
        iSpiderEye = new ItemStack(Items.spider_eye, 1, 0);
        iAllium = new ItemStack(Blocks.red_flower, 1, 2);
    }
}
