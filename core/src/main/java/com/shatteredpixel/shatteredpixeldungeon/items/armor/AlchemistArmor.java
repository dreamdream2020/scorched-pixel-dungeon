/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2021 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.items.armor;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.Dungeon;
import com.shatteredpixel.shatteredpixeldungeon.actors.Actor;
import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Buff;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.FlavourBuff;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Invisibility;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.Mob;
import com.shatteredpixel.shatteredpixeldungeon.effects.MagicMissile;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.watabou.noosa.Image;
import com.watabou.noosa.audio.Sample;

public class AlchemistArmor extends ClassArmor {


	{
		image = ItemSpriteSheet.ARMOR_ALCHEMIST;
	}

	//// Legacy
	//public void doSpecial() {
	//
	//	charge -= 35;
	//	updateQuickslot();
	//
	//	for (Mob mob : Dungeon.level.mobs.toArray(new Mob[0])) {
	//		if (Dungeon.level.heroFOV[mob.pos]
	//				&& mob.alignment != Char.Alignment.ALLY) {
	//			Buff.prolong( mob, MountNLoad.class, MountNLoad.DURATION );
	//		}
	//	}
	//
	//	curUser.spendAndNext( 0f );
	//	curUser.sprite.operate( curUser.pos );
	//	curUser.sprite.showStatus( CharSprite.POSITIVE, Messages.get(AlchemistArmor.class, "ac_special") );
	//
	//	Invisibility.dispel();
	//	curUser.busy();
	//
	//	curUser.sprite.emitter().start(MagicMissile.MagicParticle.ATTRACTING, 0.025f, 20 );
	//	Sample.INSTANCE.play( Assets.Sounds.CHARGEUP );
	//}


}