package com.crazyandcoder.top.university.mvp.contract.main;

import androidx.fragment.app.FragmentManager;

import com.crazyandcoder.android.lib.base.mvp.ICrazyModel;
import com.crazyandcoder.android.lib.base.mvp.ICrazyView;


/**
 * ================================================
 *
 * @Author: crazyandcoder
 * @Version: 1.0
 * ================================================
 */
public interface MainContract {

    interface View extends ICrazyView {

        FragmentManager getMainTabViewPagerSupportFragmentManager();
        
    }

    /**
     * Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
     */
    interface Model extends ICrazyModel {

    }
}
