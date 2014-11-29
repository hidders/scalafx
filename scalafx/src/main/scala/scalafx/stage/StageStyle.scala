/*
 * Copyright (c) 2011-2014, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package scalafx.stage

import javafx.{stage => jfxs}

import scalafx.delegate.{SFXEnumDelegate, SFXEnumDelegateCompanion}

object StageStyle
  extends SFXEnumDelegateCompanion[jfxs.StageStyle, StageStyle] {

  /**
   * Defines a normal Stage style with a solid white background and platform decorations.
   */
  val DECORATED = new StageStyle(jfxs.StageStyle.DECORATED)

  /**
   * Defines a Stage style with a solid white background and no decorations.
   */
  val UNDECORATED = new StageStyle(jfxs.StageStyle.UNDECORATED)

  /**
   * Defines a Stage style with a transparent background and no decorations.
   */
  val TRANSPARENT = new StageStyle(jfxs.StageStyle.TRANSPARENT)

  /**
   * Defines a Stage style with a solid white background and minimal platform decorations used for a utility window.
   */
  val UTILITY = new StageStyle(jfxs.StageStyle.UTILITY)

  /** Defines a Stage style with platform decorations and eliminates the border between client area and decorations. */
  val UNIFIED = new StageStyle(jfxs.StageStyle.UNIFIED)

  protected override def unsortedValues: Array[StageStyle] = Array(DECORATED, UNDECORATED, TRANSPARENT, UTILITY, UNIFIED)

}

/**
 * Wraps [[http://docs.oracle.com/javase/8/javafx/api/javafx/stage/StageStyle.html]]
 */
sealed case class StageStyle(override val delegate: jfxs.StageStyle)
  extends SFXEnumDelegate[jfxs.StageStyle]