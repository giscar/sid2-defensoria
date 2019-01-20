/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.dp.sid.atencion.entity.type;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JCARRILLO
 */
public enum EstadoRegistroType {
    INACTIVO(0, "REGISTRO INACTIVO"),
    ACTIVO(1, "REGISTRO ACTIVO");
    
    /** La Constante list. */
    private static final List<EstadoRegistroType> list = new ArrayList<>();
    /** La Constante lookup. */
    private static final Map<Integer, EstadoRegistroType> lookup = new HashMap<>();
    static {
	for (EstadoRegistroType s : EnumSet.allOf(EstadoRegistroType.class)) {
		list.add(s);
                lookup.put(s.getKey(), s);
	}
    }
    /** El key. */
    private final Integer key;
    /** El value. */
    private final String value;
    
    private EstadoRegistroType(Integer key, String value) {
	this.key = key;
	this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
    	return value;
    }
        
    public static EstadoRegistroType get(Integer key) {
	return lookup.get(key);
    }
}
