/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.destinationsol.menu;

import com.badlogic.gdx.math.Rectangle;

public class MenuLayout {
  public static final float BG_BORDER = .03f;
  public final float buttonWidth;
  public final float buttonHeight;
  public final float colCenter;
  public final float row0;
  private final float rowHeight;
  private final float padding;
  private static final int numberOfRowsTotal = 5;

  public MenuLayout(float r) {
    buttonWidth = .30f * r;
    buttonHeight = .1f;
    padding = .1f * buttonHeight;
    rowHeight = buttonHeight + padding;
    colCenter = .5f * r - buttonWidth / 2;
    row0 = 1 - padding - numberOfRowsTotal * rowHeight;
  }

  public Rectangle buttonRectangleForRow(int row) {
    float y = row0 + rowHeight * row;
    return new Rectangle(colCenter, y, buttonWidth, buttonHeight);
  }

  public Rectangle backgroundRectangle(int startRow, int rowCount) {
    float x = colCenter;
    float y = row0 + rowHeight * startRow;
    return new Rectangle(x - BG_BORDER, y - BG_BORDER, buttonWidth + 2 * BG_BORDER, rowHeight * rowCount - padding + 2 * BG_BORDER);
  }
}
