/*
 *  Copyright (C) 2010-2013 JPEXS
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.tags.base;

import com.jpexs.decompiler.flash.tags.Tag;
import com.jpexs.decompiler.flash.types.SHAPE;
import java.util.List;

/**
 *
 * @author JPEXS
 */
public interface FontTag extends AloneTag {

    public int getFontId();

    public SHAPE[] getGlyphShapeTable();

    public char glyphToChar(List<Tag> tags, int glyphIndex);

    public int charToGlyph(List<Tag> tags, char c);

    public int getGlyphAdvance(int glyphIndex);

    public int getGlyphWidth(int glyphIndex);

    public String getFontName(List<Tag> tags);

    public boolean isSmall();

    public boolean isBold();

    public boolean isItalic();

    public int getDivider();

    public int getAscent();

    public int getDescent();

    public int getLeading();
}
