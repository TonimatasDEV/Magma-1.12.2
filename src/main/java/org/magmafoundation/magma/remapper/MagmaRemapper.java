package org.magmafoundation.magma.remapper;

import net.md_5.specialsource.JarMapping;
import net.md_5.specialsource.JarRemapper;

public class MagmaRemapper extends JarRemapper {

    public MagmaRemapper(JarMapping jarMapping) {
        super(jarMapping);
    }

    @Override
    public String mapSignature(final String signature, final boolean typeSignature) {
        try {
            return super.mapSignature(signature, typeSignature);
        } catch (Exception e) {
            return signature;
        }
    }

    @Override
    public String mapFieldName(final String owner, final String name, final String desc, final int access) {
        return super.mapFieldName(owner, name, desc, -1);
    }
}
