/*
 * 				Firetweet - Twitter client for Android
 * 
 *  Copyright (C) 2012-2014 Mariotaku Lee <mariotaku.lee@gmail.com>
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

package org.getlantern.firetweet.fragment;

import android.os.Bundle;
import android.preference.Preference;

import org.getlantern.firetweet.R;
import org.getlantern.firetweet.model.ParcelableAccount;

public class AccountNotificationSettingsFragment extends BaseAccountPreferenceFragment {

	@Override
	public void onActivityCreated(final Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		final Preference preference = findPreference(KEY_NOTIFICATION_LIGHT_COLOR);
		final ParcelableAccount account = getAccount();
		if (preference != null && account != null) {
			preference.setDefaultValue(account.color);
		}
	}

	@Override
	protected int getPreferencesResource() {
		return R.xml.preferences_account_notifications;
	}

	@Override
	protected boolean getSwitchPreferenceDefault() {
		return DEFAULT_NOTIFICATION;
	}

	@Override
	protected String getSwitchPreferenceKey() {
		return KEY_NOTIFICATION;
	}

}
