/*
 * github-users-web - lists GitHub users. Minimal app demonstrating
 * cross-platform app development (Web, Android, iOS) where core
 * logic is shared and transpiled from Java to JavaScript and
 * Objective-C. This project delivers Web version.
 *
 * Copyright (C) 2017  Kazimierz Pogoda
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.xemantic.githubusers.web.view;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * All the templates of this app. Every template added in the {@code templates.soy}
 * file should be also added here. This file can be auto-generated.
 *
 * @author morisil
 */
@JsType(name = "template", isNative = true)
public class Templates {

  @JsMethod
  public static native void header();

  @JsMethod
  public static native void drawer();

  @JsMethod
  public static native void main();

  @JsMethod
  public static native void snackbar();

  @JsMethod
  public static native void userList();

  @JsMethod
  public static native void user(UserParams data);

  @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
  public static class UserParams {
    public String avatarUrl;
    public String login;
  }

}
