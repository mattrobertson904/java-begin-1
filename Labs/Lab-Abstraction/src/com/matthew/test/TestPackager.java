package com.matthew.test;

import com.matthew.builders.Assembler;
import com.matthew.interfaces.Packager;
import com.matthew.model.Package;

public class TestPackager {

	public static void main(String[] args) {
		Packager packager = new Assembler();
		
		Package myPackage = packager.assemblePackage();
		
		System.out.println(myPackage);
	}
}
