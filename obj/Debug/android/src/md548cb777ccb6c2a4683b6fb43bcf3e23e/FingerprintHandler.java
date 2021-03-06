package md548cb777ccb6c2a4683b6fb43bcf3e23e;


public class FingerprintHandler
	extends android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthenticationFailed:()V:GetOnAuthenticationFailedHandler\n" +
			"n_onAuthenticationSucceeded:(Landroid/hardware/fingerprint/FingerprintManager$AuthenticationResult;)V:GetOnAuthenticationSucceeded_Landroid_hardware_fingerprint_FingerprintManager_AuthenticationResult_Handler\n" +
			"";
		mono.android.Runtime.register ("XamarinFingerAuth.FingerprintHandler, XamarinFingerAuth, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", FingerprintHandler.class, __md_methods);
	}


	public FingerprintHandler () throws java.lang.Throwable
	{
		super ();
		if (getClass () == FingerprintHandler.class)
			mono.android.TypeManager.Activate ("XamarinFingerAuth.FingerprintHandler, XamarinFingerAuth, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public FingerprintHandler (android.content.Context p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == FingerprintHandler.class)
			mono.android.TypeManager.Activate ("XamarinFingerAuth.FingerprintHandler, XamarinFingerAuth, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onAuthenticationFailed ()
	{
		n_onAuthenticationFailed ();
	}

	private native void n_onAuthenticationFailed ();


	public void onAuthenticationSucceeded (android.hardware.fingerprint.FingerprintManager.AuthenticationResult p0)
	{
		n_onAuthenticationSucceeded (p0);
	}

	private native void n_onAuthenticationSucceeded (android.hardware.fingerprint.FingerprintManager.AuthenticationResult p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
