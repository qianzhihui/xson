package org.xson.core.generator;

import org.xson.core.XsonGenerator;
import org.xson.core.asm.MethodVisitor;

public class ByteGenerator implements XsonGenerator {

	// @Override
	// public void generateWriterCode(MethodVisitor mv) {
	// mv.visitMethodInsn(INVOKESTATIC, WRITER_DESC, "getByteDateFrame", "(B)[B");
	// }

	@Override
	public void generateReaderCode(MethodVisitor mv) {
		mv.visitMethodInsn(INVOKEVIRTUAL, READER_DESC, "getByte", "()B");
	}
	
}
