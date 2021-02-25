#include <jni.h>
#include <Gamepad.h>
#include <windows.h>
#include <Xinput.h>

JNIEXPORT jint JNICALL Java_Gamepad_getMaxGamepad
  (JNIEnv *, jclass) {
	return XUSER_MAX_COUNT;
}

/*
 * Class:     Gamepad
 * Method:    getState
 * Signature: (ILState;)I
 */
JNIEXPORT jint JNICALL Java_Gamepad_getState
  (JNIEnv * env, jclass class_gamepad, jint gamepad, jobject state) {
	XINPUT_STATE raw_state;
	ZeroMemory(&raw_state, sizeof(XINPUT_STATE));
	jint error = XInputGetState((unsigned long)gamepad, &raw_state);

	if(error != ERROR_SUCCESS || state==NULL)
		return error;

	jclass class_state = env->GetObjectClass(state);
	jfieldID wButtonsID = env->GetFieldID(class_state, "wButtons", "S");
	jfieldID bLeftTriggerID = env->GetFieldID(class_state, "bLeftTrigger", "B");
	jfieldID bRightTriggerID = env->GetFieldID(class_state, "bRightTrigger", "B");
	jfieldID sThumbLXID = env->GetFieldID(class_state, "sThumbLX", "S");
	jfieldID sThumbLYID = env->GetFieldID(class_state, "sThumbLY", "S");
	jfieldID sThumbRXID = env->GetFieldID(class_state, "sThumbRX", "S");
	jfieldID sThumbRYID = env->GetFieldID(class_state, "sThumbRY", "S");

	env->SetShortField(state, wButtonsID, raw_state.Gamepad.wButtons);
	env->SetShortField(state, bLeftTriggerID, raw_state.Gamepad.bLeftTrigger);
	env->SetShortField(state, bRightTriggerID, raw_state.Gamepad.bRightTrigger);
	env->SetShortField(state, sThumbLXID, raw_state.Gamepad.sThumbLX);
	env->SetShortField(state, sThumbLYID, raw_state.Gamepad.sThumbLY);
	env->SetShortField(state, sThumbRXID, raw_state.Gamepad.sThumbRX);
	env->SetShortField(state, sThumbRYID, raw_state.Gamepad.sThumbRY);

	return error;
}
