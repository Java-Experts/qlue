/* 
 * Qlue Web Application Framework
 * Copyright 2009-2012 Ivan Ristic <ivanr@webkreator.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webkreator.qlue.pages;

import com.webkreator.qlue.Page;
import com.webkreator.qlue.QlueMapping;
import com.webkreator.qlue.util.WebUtil;
import com.webkreator.qlue.view.View;

/**
 * Handle a 404. 
 */
@QlueMapping(suffix = ".html")
public class handlePageNotFound extends Page {

	@Override
	public View service() throws Exception {
		WebUtil.writeMessage(context, "Not Found");
		return null;
	}
}
