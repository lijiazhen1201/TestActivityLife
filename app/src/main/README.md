# TestActivityLife

## Activity的生命周期

1. 单个Activity开始到结束

        02-13 01:26:49.053 970-970/? I/info: MainActivity.onCreate
        02-13 01:26:49.193 970-970/? I/info: MainActivity.onStart
        02-13 01:26:49.193 970-970/? I/info: MainActivity.onResume

        02-13 01:27:59.763 970-970/? I/info: MainActivity.onPause
        02-13 01:28:01.063 970-970/? I/info: MainActivity.onStop
        02-13 01:28:01.063 970-970/? I/info: MainActivity.onDestroy
        
2. Activity跳转到普通Activity

        02-13 01:41:15.963 970-970/? I/info: MainActivity.onCreate
        02-13 01:41:16.163 970-970/? I/info: MainActivity.onStart
        02-13 01:41:16.163 970-970/? I/info: MainActivity.onResume

        02-13 01:41:32.763 970-970/? I/info: MainActivity.onPause
        02-13 01:41:32.903 970-970/? I/info: NormalActivity.onCreate
        02-13 01:41:32.973 970-970/? I/info: NormalActivity.onStart
        02-13 01:41:33.003 970-970/? I/info: NormalActivity.onResume
        02-13 01:41:33.853 970-970/? I/info: MainActivity.onStop

        02-13 01:42:03.493 970-970/? I/info: NormalActivity.onPause
        02-13 01:42:03.503 970-970/? I/info: MainActivity.onRestart
        02-13 01:42:03.503 970-970/? I/info: MainActivity.onStart
        02-13 01:42:03.513 970-970/? I/info: MainActivity.onResume
        02-13 01:42:04.173 970-970/? I/info: NormalActivity.onStop
        02-13 01:42:04.173 970-970/? I/info: NormalActivity.onDestroy

        02-13 01:42:31.343 970-970/? I/info: MainActivity.onPause
        02-13 01:42:32.203 970-970/? I/info: MainActivity.onStop
        02-13 01:42:32.203 970-970/? I/info: MainActivity.onDestroy

3. Activity跳转到对话框式Activity

		<activity
           android:name=".activity.DialogActivity"
           android:label="DialogActivity"
           android:theme="@android:style/Theme.Dialog" />
           
注册Activity时选择对话框式的主题


        02-13 01:49:24.793 1137-1137/? I/info: MainActivity.onCreate
        02-13 01:49:25.063 1137-1137/? I/info: MainActivity.onStart
        02-13 01:49:25.063 1137-1137/? I/info: MainActivity.onResume

        02-13 01:49:43.893 1137-1137/? I/info: MainActivity.onPause
        02-13 01:49:43.953 1137-1137/? I/info: DialogActivity.onCreate
        02-13 01:49:43.973 1137-1137/? I/info: DialogActivity.onStart
        02-13 01:49:43.973 1137-1137/? I/info: DialogActivity.onResume

        02-13 01:50:07.343 1137-1137/? I/info: DialogActivity.onPause
        02-13 01:50:07.393 1137-1137/? I/info: MainActivity.onResume
        02-13 01:50:07.543 1137-1137/? I/info: DialogActivity.onStop
        02-13 01:50:07.563 1137-1137/? I/info: DialogActivity.onDestroy

        02-13 01:50:29.093 1137-1137/? I/info: MainActivity.onPause
        02-13 01:50:29.993 1137-1137/? I/info: MainActivity.onStop
        02-13 01:50:29.993 1137-1137/? I/info: MainActivity.onDestroy