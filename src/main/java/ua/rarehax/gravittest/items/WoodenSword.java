package ua.rarehax.gravittest.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class WoodenSword extends SwordItem {
    public WoodenSword(Tier tier, int damage, float speed, Properties props) {

        super(tier, damage, speed, props);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setSecondsOnFire(5);

        return super.hurtEnemy(stack, target, attacker);
    }
}