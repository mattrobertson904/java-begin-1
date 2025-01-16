package com.matthew;

import com.matthew.assemblers.MyAssembler;
import com.yourname.builders.Assembler;
import com.yourname.interfaces.Packager;
import com.yourname.model.Package;

public class TestAssember {
	
	public static void main(String[] args) {
		Packager packager = new MyAssembler();
		Package myPackage = packager.assemblePackage();
		System.out.println(myPackage);
	}

	@Override
	public String toString() {
		return "TestAssember [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
