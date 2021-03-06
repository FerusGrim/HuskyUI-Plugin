/*
 * This file is part of HuskyUI.
 *
 * HuskyUI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * HuskyUI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with HuskyUI.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codehusky.huskyui.states.element;

import com.codehusky.huskyui.StateContainer;
import org.spongepowered.api.item.inventory.ItemStack;
import javax.annotation.Nonnull;

public class Element {

    @Nonnull private final ItemStack item;

    public Element(@Nonnull final ItemStack item) {
        this.item = item;
    }

    @Nonnull
    public ItemStack getItem() {
        return this.item;
    }

    @Nonnull
    public Element copy(@Nonnull final StateContainer newContainer) { // We don't use this on purpose.
        return new Element(this.item.copy());
    }
}
