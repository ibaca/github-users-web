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

package com.xemantic.githubusers.web.model;

import com.xemantic.githubusers.logic.model.SearchResult;
import com.xemantic.githubusers.logic.model.User;
import com.xemantic.githubusers.web.service.json.JsonSearchResult;
import com.xemantic.githubusers.web.service.json.JsonUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Web version of the {@link SearchResult}. Adapts Java calls
 * to the raw JSON object.
 *
 * @author morisil
 */
public class WebSearchResult implements SearchResult {

  private final JsonSearchResult _payload;

  public WebSearchResult(JsonSearchResult payload) {
    _payload = payload;
  }

  @Override
  public int getTotalCount() {
    return _payload.total_count;
  }

  @Override
  public boolean isIncompleteResult() {
    return _payload.incomplete_result;
  }

  @Override
  public List<User> getItems() {
    List<User> list = new ArrayList<>(_payload.items.length);
    for (JsonUser user : _payload.items) {
      list.add(new WebUser(user));
    }
    return list;
  }

}
