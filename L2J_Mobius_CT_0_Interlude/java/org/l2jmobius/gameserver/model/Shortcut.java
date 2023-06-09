/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jmobius.gameserver.model;

import org.l2jmobius.gameserver.enums.ShortcutType;

/**
 * Shortcut DTO.
 * @author Zoey76
 */
public class Shortcut
{
	/** Slot from 0 to 11. */
	private final int _slot;
	/** Page from 0 to 9. */
	private final int _page;
	/** Type: item, skill, action, macro, recipe, bookmark. */
	private final ShortcutType _type;
	/** Shortcut ID. */
	private final int _id;
	/** Shortcut level (skills). */
	private final int _level;
	
	public Shortcut(int slot, int page, ShortcutType type, int id, int level)
	{
		_slot = slot;
		_page = page;
		_type = type;
		_id = id;
		_level = level;
	}
	
	/**
	 * Gets the shortcut ID.
	 * @return the ID
	 */
	public int getId()
	{
		return _id;
	}
	
	/**
	 * Gets the shortcut level.
	 * @return the level
	 */
	public int getLevel()
	{
		return _level;
	}
	
	/**
	 * Gets the shortcut page.
	 * @return the page
	 */
	public int getPage()
	{
		return _page;
	}
	
	/**
	 * Gets the shortcut slot.
	 * @return the slot
	 */
	public int getSlot()
	{
		return _slot;
	}
	
	/**
	 * Gets the shortcut type.
	 * @return the type
	 */
	public ShortcutType getType()
	{
		return _type;
	}
}
