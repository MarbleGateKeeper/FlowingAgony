package love.marblegate.flowingagony.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static ForgeConfigSpec ACT_CONFIG;
    public static ForgeConfigSpec.BooleanValue HYBRID_SERVER_USER;
    public static ForgeConfigSpec.BooleanValue AN_ENCHANTED_GOLDEN_APPLE_A_DAY;
    public static ForgeConfigSpec.BooleanValue DEATH_PUNK;
    public static ForgeConfigSpec.BooleanValue EXOTIC_HEALER;
    public static ForgeConfigSpec.BooleanValue SAVOR_THE_TASTED;
    public static ForgeConfigSpec.BooleanValue TRICKSTER;
    public static ForgeConfigSpec.BooleanValue COVERT_KNIFE;
    public static ForgeConfigSpec.BooleanValue ENCIOUS_KIND;
    public static ForgeConfigSpec.BooleanValue EYESORE;
    public static ForgeConfigSpec.BooleanValue SOURCE_OF_ENVY;
    public static ForgeConfigSpec.BooleanValue THORN_IN_FLESH;
    public static ForgeConfigSpec.BooleanValue CLEANSING_BEFORE_USING;
    public static ForgeConfigSpec.BooleanValue COME_BACK_AT_DUSK;
    public static ForgeConfigSpec.BooleanValue DIRTY_MONEY;
    public static ForgeConfigSpec.BooleanValue PILFERAGE_CREED;
    public static ForgeConfigSpec.BooleanValue REGULAR_CUSTOMER_PROGRAM;
    public static ForgeConfigSpec.BooleanValue ARMOR_UP;
    public static ForgeConfigSpec.BooleanValue FRIVOLOUS_STEP;
    public static ForgeConfigSpec.BooleanValue MIRACULOUS_ESCAPE;
    public static ForgeConfigSpec.BooleanValue POTENTIAL_BURST;
    public static ForgeConfigSpec.BooleanValue STUBBORN_STEP;
    public static ForgeConfigSpec.BooleanValue INFECTIOUS_MALICE;
    public static ForgeConfigSpec.BooleanValue I_SEE_YOU_NOW;
    public static ForgeConfigSpec.BooleanValue MALICE_OUTBREAK;
    public static ForgeConfigSpec.BooleanValue PERCEIVED_MALICE;
    public static ForgeConfigSpec.BooleanValue VENGEANCE;
    public static ForgeConfigSpec.BooleanValue AGONY_SCREAMER;
    public static ForgeConfigSpec.BooleanValue CUTTING_WATERMELON_DREAM;
    public static ForgeConfigSpec.BooleanValue INSANE_POET;
    public static ForgeConfigSpec.BooleanValue PAPER_BRAIN;
    public static ForgeConfigSpec.BooleanValue SHOCK_THERAPY;
    public static ForgeConfigSpec.BooleanValue BURNING_PHOBIA;
    public static ForgeConfigSpec.BooleanValue CONSTRAINED_HEART;
    public static ForgeConfigSpec.BooleanValue DROWNING_PHOBIA;
    public static ForgeConfigSpec.BooleanValue PIERCING_FEVER;
    public static ForgeConfigSpec.BooleanValue PRAYER_OF_PAIN;
    public static ForgeConfigSpec.BooleanValue FRESH_REVENGE;
    public static ForgeConfigSpec.BooleanValue HATRED_BLOODLINE;
    public static ForgeConfigSpec.BooleanValue OUTRAGEOUS_SPIRIT;
    public static ForgeConfigSpec.BooleanValue RESENTFUL_SOUL;
    public static ForgeConfigSpec.BooleanValue TOO_RESENTFUL_TO_DIE;
    public static ForgeConfigSpec.BooleanValue MORIRS_DEATHWISH;
    public static ForgeConfigSpec.BooleanValue MORIRS_LIFEBOUND;
    public static ForgeConfigSpec.BooleanValue NECESSARY_EVIL;
    public static ForgeConfigSpec.BooleanValue SURVIVAL_RUSE;
    public static ForgeConfigSpec.BooleanValue SURVIVAL_SHORTCUT;
    public static ForgeConfigSpec.BooleanValue CORRUPTED_KINDRED;
    public static ForgeConfigSpec.BooleanValue LIGHTBURN_FUNGAL_PARASITIC;
    public static ForgeConfigSpec.BooleanValue PROTOTYPE_CHAOTIC;
    public static ForgeConfigSpec.BooleanValue PROTOTYPE_CHAOTIC_TYPE_BETA;
    public static ForgeConfigSpec.BooleanValue SHADOWBORN;
    public static ForgeConfigSpec.BooleanValue BURIAL_OBJECT;

    static{
        ForgeConfigSpec.Builder ACT_BUILDER = new ForgeConfigSpec.Builder();
        ACT_BUILDER.comment("Compatibility Setting").push("compatibility");
        HYBRID_SERVER_USER = ACT_BUILDER.comment(
                "-------------IMPORTANT!-------------",
                "If you are using hybrid server (such as arclight), please set this config option to \"true\".",
                "Enchantment \"Cleansing Before Using\" will be complete disabled,",
                "which means it cannot be obtained and applied on survival mode and it won't function.",
                "It is because hybrid server are changing forge's event hook and it does cause serious bugs sometimes.",
                "We are not responsible to fixing bug caused hybrid server, but here we still offer a temporary solution.").define("HYBRID_SERVER_USER",false);
        ACT_BUILDER.pop();

        ACT_BUILDER.comment("Enchantment Acquirable Setting").push("general");
        AN_ENCHANTED_GOLDEN_APPLE_A_DAY = ACT_BUILDER.comment("Is \"An Enchanted Golden Apple A Day\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("AN_ENCHANTED_GOLDEN_APPLE_A_DAY",true);
        DEATH_PUNK = ACT_BUILDER.comment("Is \"Deathpunk\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("DEATH_PUNK",true);
        EXOTIC_HEALER = ACT_BUILDER.comment("Is \"Exotic Healer\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("EXOTIC_HEALER",true);
        SAVOR_THE_TASTED = ACT_BUILDER.comment("Is \"Savor the Tasted\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("SAVOR_THE_TASTED",true);
        TRICKSTER = ACT_BUILDER.comment("Is \"Trickster\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("TRICKSTER",true);
        COVERT_KNIFE = ACT_BUILDER.comment("Is \"Covert Knife\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("COVERT_KNIFE",true);
        ENCIOUS_KIND = ACT_BUILDER.comment("Is \"Envious Kind\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("ENCIOUS_KIND",true);
        EYESORE = ACT_BUILDER.comment("Is \"Eyesore\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("EYESORE",true);
        SOURCE_OF_ENVY = ACT_BUILDER.comment("Is \"Source of Envy\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("SOURCE_OF_ENVY",true);
        THORN_IN_FLESH = ACT_BUILDER.comment("Is \"Thorn in Flesh\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("THORN_IN_FLESH",true);
        CLEANSING_BEFORE_USING = ACT_BUILDER.comment("Is \"Cleansing Before Using\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("CLEANSING_BEFORE_USING",true);
        COME_BACK_AT_DUSK = ACT_BUILDER.comment("Is \"Come Back At Dusk\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("COME_BACK_AT_DUSK",true);
        DIRTY_MONEY = ACT_BUILDER.comment("Is \"Dirty Money\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("DIRTY_MONEY",true);
        PILFERAGE_CREED = ACT_BUILDER.comment("Is \"Pilferage Creed\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("PILFERAGE_CREED",true);
        REGULAR_CUSTOMER_PROGRAM = ACT_BUILDER.comment("Is \"Regular Customer Program\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("REGULAR_CUSTOMER_PROGRAM",true);
        ARMOR_UP = ACT_BUILDER.comment("Is \"Armor Up!\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("ARMOR_UP",true);
        FRIVOLOUS_STEP = ACT_BUILDER.comment("Is \"Frivolous Step\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("FRIVOLOUS_STEP",true);
        MIRACULOUS_ESCAPE = ACT_BUILDER.comment("Is \"Miraculous Escape\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("MIRACULOUS_ESCAPE",true);
        POTENTIAL_BURST = ACT_BUILDER.comment("Is \"Potential Burst\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("POTENTIAL_BURST",true);
        STUBBORN_STEP = ACT_BUILDER.comment("Is \"Stubborn Step\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("STUBBORN_STEP",true);
        INFECTIOUS_MALICE = ACT_BUILDER.comment("Is \"Infectious Malice\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("INFECTIOUS_MALICE",true);
        I_SEE_YOU_NOW = ACT_BUILDER.comment("Is \"I See You Now\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("I_SEE_YOU_NOW",true);
        MALICE_OUTBREAK = ACT_BUILDER.comment("Is \"Malice OutBreak\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("MALICE_OUTBREAK",true);
        PERCEIVED_MALICE = ACT_BUILDER.comment("Is \"Perceived Malice\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("PERCEIVED_MALICE",true);
        VENGEANCE = ACT_BUILDER.comment("Is \"Vengeance\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("VENGEANCE",true);
        AGONY_SCREAMER = ACT_BUILDER.comment("Is \"Agony Screamer\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("AGONY_SCREAMER",true);
        CUTTING_WATERMELON_DREAM = ACT_BUILDER.comment("Is \"Cutting Watermelon Dream\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("CUTTING_WATERMELON_DREAM",true);
        INSANE_POET = ACT_BUILDER.comment("Is \"Insane Poet\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("INSANE_POET",true);
        PAPER_BRAIN = ACT_BUILDER.comment("Is \"Paper Brain\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("PAPER_BRAIN",true);
        SHOCK_THERAPY = ACT_BUILDER.comment("Is \"Shock Therapy\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("SHOCK_THERAPY",true);
        BURNING_PHOBIA = ACT_BUILDER.comment("Is \"Burning Phobia\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("BURNING_PHOBIA",true);
        CONSTRAINED_HEART = ACT_BUILDER.comment("Is \"Constrained Heart\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("CONSTRAINED_HEART",true);
        DROWNING_PHOBIA = ACT_BUILDER.comment("Is \"Drowning Phobia\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("DROWNING_PHOBIA",true);
        PIERCING_FEVER = ACT_BUILDER.comment("Is \"Piercing Fever\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("PIERCING_FEVER",true);
        PRAYER_OF_PAIN = ACT_BUILDER.comment("Is \"Prayer of Pain\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("PRAYER_OF_PAIN",true);
        FRESH_REVENGE = ACT_BUILDER.comment("Is \"Fresh Revenge\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("FRESH_REVENGE",true);
        HATRED_BLOODLINE = ACT_BUILDER.comment("Is \"Hatred Bloodline\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("HATRED_BLOODLINE",true);
        OUTRAGEOUS_SPIRIT = ACT_BUILDER.comment("Is \"Outrageous Spirit\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("OUTRAGEOUS_SPIRIT",true);
        RESENTFUL_SOUL = ACT_BUILDER.comment("Is \"Resentful Soul\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("RESENTFUL_SOUL",true);
        TOO_RESENTFUL_TO_DIE = ACT_BUILDER.comment("Is \"Too Resentful to Die\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("TOO_RESENTFUL_TO_DIE",true);
        MORIRS_DEATHWISH = ACT_BUILDER.comment("Is \"Morir's Deathwish\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("MORIRS_DEATHWISH",true);
        MORIRS_LIFEBOUND = ACT_BUILDER.comment("Is \"Morir's Lifebound\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("MORIRS_LIFEBOUND",true);
        NECESSARY_EVIL = ACT_BUILDER.comment("Is \"Necessary Evil\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("NECESSARY_EVIL",true);
        SURVIVAL_RUSE = ACT_BUILDER.comment("Is \"Survival Ruse\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("SURVIVAL_RUSE",true);
        SURVIVAL_SHORTCUT = ACT_BUILDER.comment("Is \"Survival Shortcut\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("SURVIVAL_SHORTCUT",true);
        CORRUPTED_KINDRED = ACT_BUILDER.comment("Is \"Corrupted Kindred\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("CORRUPTED_KINDRED",true);
        LIGHTBURN_FUNGAL_PARASITIC = ACT_BUILDER.comment("Is \"Lightburn Fungal Parasitic\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("LIGHTBURN_FUNGAL_PARASITIC",true);
        PROTOTYPE_CHAOTIC = ACT_BUILDER.comment("Is \"Prototype Chaotic\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("PROTOTYPE_CHAOTIC",true);
        PROTOTYPE_CHAOTIC_TYPE_BETA = ACT_BUILDER.comment("Is \"Prototype Chaotic Type β\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("PROTOTYPE_CHAOTIC_TYPE_BETA",true);
        SHADOWBORN = ACT_BUILDER.comment("Is \"Shadowburn\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("SHADOWBORN",true);
        BURIAL_OBJECT = ACT_BUILDER.comment("Is \"Burial Object\" enchantment acquirable by enchantment table, toot, fishing or trading?").define("BURIAL_OBJECT",true);
        ACT_BUILDER.pop();
        ACT_CONFIG = ACT_BUILDER.build();
    }
}
