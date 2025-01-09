package com.github.bakycoder.backtobed.util.localization;

import com.github.bakycoder.backtobed.BackToBed;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class LocalizationKeyGenerator {
    private static String getSeparatedArgs(String... args) {
        return String.join(".", args);
    }

    private static String generateItemLocalization(Item item, String category, String suffix) {
        String itemId = BuiltInRegistries.ITEM.getKey(item).getPath();
        return getSeparatedArgs(LocalizationKeys.ITEM.getKey(), BackToBed.MOD_ID, itemId, category, suffix);
    }

    private static String generateItemLocalization(String itemId, String category, String suffix) {
        return getSeparatedArgs(LocalizationKeys.ITEM.getKey(), BackToBed.MOD_ID, itemId, category, suffix);
    }

    public static String getTooltip(LocalizationKeys lKey) {
        return getSeparatedArgs(BackToBed.MOD_ID, LocalizationKeys.TOOLTIP.getKey(), lKey.getKey());
    }

    public static String getDimension(String dimension) {
        return getSeparatedArgs(BackToBed.MOD_ID, LocalizationKeys.DIMENSION.getKey(), dimension);
    }

    public static String getItemTooltip(Item item, LocalizationKeys lKey) {
        return generateItemLocalization(item, LocalizationKeys.TOOLTIP.getKey(), lKey.getKey());
    }

    public static String getItemTooltip(String itemId, LocalizationKeys lKey) {
        return generateItemLocalization(itemId, LocalizationKeys.TOOLTIP.getKey(), lKey.getKey());
    }

    public static String getItemCondition(Item item, String condition) {
        return generateItemLocalization(item, LocalizationKeys.CONDITION.getKey(), condition);
    }
}