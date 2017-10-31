/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrivilegeBag implements org.apache.thrift.TBase<PrivilegeBag, PrivilegeBag._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrivilegeBag");

  private static final org.apache.thrift.protocol.TField PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("privileges", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PrivilegeBagStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PrivilegeBagTupleSchemeFactory());
  }

  private List<HiveObjectPrivilege> privileges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIVILEGES((short)1, "privileges");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRIVILEGES
          return PRIVILEGES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("privileges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HiveObjectPrivilege.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrivilegeBag.class, metaDataMap);
  }

  public PrivilegeBag() {
  }

  public PrivilegeBag(
    List<HiveObjectPrivilege> privileges)
  {
    this();
    this.privileges = privileges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrivilegeBag(PrivilegeBag other) {
    if (other.isSetPrivileges()) {
      List<HiveObjectPrivilege> __this__privileges = new ArrayList<HiveObjectPrivilege>();
      for (HiveObjectPrivilege other_element : other.privileges) {
        __this__privileges.add(new HiveObjectPrivilege(other_element));
      }
      this.privileges = __this__privileges;
    }
  }

  public PrivilegeBag deepCopy() {
    return new PrivilegeBag(this);
  }

  @Override
  public void clear() {
    this.privileges = null;
  }

  public int getPrivilegesSize() {
    return (this.privileges == null) ? 0 : this.privileges.size();
  }

  public java.util.Iterator<HiveObjectPrivilege> getPrivilegesIterator() {
    return (this.privileges == null) ? null : this.privileges.iterator();
  }

  public void addToPrivileges(HiveObjectPrivilege elem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<HiveObjectPrivilege>();
    }
    this.privileges.add(elem);
  }

  public List<HiveObjectPrivilege> getPrivileges() {
    return this.privileges;
  }

  public void setPrivileges(List<HiveObjectPrivilege> privileges) {
    this.privileges = privileges;
  }

  public void unsetPrivileges() {
    this.privileges = null;
  }

  /** Returns true if field privileges is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivileges() {
    return this.privileges != null;
  }

  public void setPrivilegesIsSet(boolean value) {
    if (!value) {
      this.privileges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRIVILEGES:
      if (value == null) {
        unsetPrivileges();
      } else {
        setPrivileges((List<HiveObjectPrivilege>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIVILEGES:
      return getPrivileges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRIVILEGES:
      return isSetPrivileges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PrivilegeBag)
      return this.equals((PrivilegeBag)that);
    return false;
  }

  public boolean equals(PrivilegeBag that) {
    if (that == null)
      return false;

    boolean this_present_privileges = true && this.isSetPrivileges();
    boolean that_present_privileges = true && that.isSetPrivileges();
    if (this_present_privileges || that_present_privileges) {
      if (!(this_present_privileges && that_present_privileges))
        return false;
      if (!this.privileges.equals(that.privileges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_privileges = true && (isSetPrivileges());
    builder.append(present_privileges);
    if (present_privileges)
      builder.append(privileges);

    return builder.toHashCode();
  }

  public int compareTo(PrivilegeBag other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PrivilegeBag typedOther = (PrivilegeBag)other;

    lastComparison = Boolean.valueOf(isSetPrivileges()).compareTo(typedOther.isSetPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privileges, typedOther.privileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PrivilegeBag(");
    boolean first = true;

    sb.append("privileges:");
    if (this.privileges == null) {
      sb.append("null");
    } else {
      sb.append(this.privileges);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrivilegeBagStandardSchemeFactory implements SchemeFactory {
    public PrivilegeBagStandardScheme getScheme() {
      return new PrivilegeBagStandardScheme();
    }
  }

  private static class PrivilegeBagStandardScheme extends StandardScheme<PrivilegeBag> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PrivilegeBag struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.privileges = new ArrayList<HiveObjectPrivilege>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  HiveObjectPrivilege _elem18; // optional
                  _elem18 = new HiveObjectPrivilege();
                  _elem18.read(iprot);
                  struct.privileges.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setPrivilegesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PrivilegeBag struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.privileges != null) {
        oprot.writeFieldBegin(PRIVILEGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.privileges.size()));
          for (HiveObjectPrivilege _iter19 : struct.privileges)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrivilegeBagTupleSchemeFactory implements SchemeFactory {
    public PrivilegeBagTupleScheme getScheme() {
      return new PrivilegeBagTupleScheme();
    }
  }

  private static class PrivilegeBagTupleScheme extends TupleScheme<PrivilegeBag> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrivilegeBag struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPrivileges()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPrivileges()) {
        {
          oprot.writeI32(struct.privileges.size());
          for (HiveObjectPrivilege _iter20 : struct.privileges)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrivilegeBag struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.privileges = new ArrayList<HiveObjectPrivilege>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            HiveObjectPrivilege _elem23; // optional
            _elem23 = new HiveObjectPrivilege();
            _elem23.read(iprot);
            struct.privileges.add(_elem23);
          }
        }
        struct.setPrivilegesIsSet(true);
      }
    }
  }

}
