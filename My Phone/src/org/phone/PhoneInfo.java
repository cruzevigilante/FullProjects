package org.phone;

public class PhoneInfo {
	public void phoneName() {
	System.out.println("Phone Name is : Iphone");
        }
	public void phoneImeiNum() {
		System.out.println("Phone IMEI number is : 2345ifg567");
		}
	public void phoneCamera() {
		System.out.println("Phone Camera is : 64 Megapixels");
	}
	public void phoneStorage() {
		System.out.println("Phone storage is : 128GB");
		}
	public void phoneOsName() {
		System.out.println("Phone OS is : I os");
    }
	public static void main(String[] args) {
		PhoneInfo t = new PhoneInfo();
		t.phoneName();
		t.phoneImeiNum();
		t.phoneCamera();
		t.phoneStorage();
		t.phoneOsName();
		
	}

}
