// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conformance.proto

package com.google.javascript.jscomp;

public interface RequirementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:jscomp.Requirement)
    com.google.protobuf.GeneratedMessageV3.
        ExtendableMessageOrBuilder<Requirement> {

  /**
   * <pre>
   * Required: The message to report when a requirement is violated. This should
   * reference a document describing the reasoning for the requirement
   * and contacts.
   * </pre>
   *
   * <code>optional string error_message = 1;</code>
   * @return Whether the errorMessage field is set.
   */
  boolean hasErrorMessage();
  /**
   * <pre>
   * Required: The message to report when a requirement is violated. This should
   * reference a document describing the reasoning for the requirement
   * and contacts.
   * </pre>
   *
   * <code>optional string error_message = 1;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * Required: The message to report when a requirement is violated. This should
   * reference a document describing the reasoning for the requirement
   * and contacts.
   * </pre>
   *
   * <code>optional string error_message = 1;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <pre>
   * Optional: A list of source path prefixes that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist = 2;</code>
   * @return A list containing the whitelist.
   */
  java.util.List<java.lang.String>
      getWhitelistList();
  /**
   * <pre>
   * Optional: A list of source path prefixes that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist = 2;</code>
   * @return The count of whitelist.
   */
  int getWhitelistCount();
  /**
   * <pre>
   * Optional: A list of source path prefixes that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist = 2;</code>
   * @param index The index of the element to return.
   * @return The whitelist at the given index.
   */
  java.lang.String getWhitelist(int index);
  /**
   * <pre>
   * Optional: A list of source path prefixes that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the whitelist at the given index.
   */
  com.google.protobuf.ByteString
      getWhitelistBytes(int index);

  /**
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist_regexp = 3;</code>
   * @return A list containing the whitelistRegexp.
   */
  java.util.List<java.lang.String>
      getWhitelistRegexpList();
  /**
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist_regexp = 3;</code>
   * @return The count of whitelistRegexp.
   */
  int getWhitelistRegexpCount();
  /**
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist_regexp = 3;</code>
   * @param index The index of the element to return.
   * @return The whitelistRegexp at the given index.
   */
  java.lang.String getWhitelistRegexp(int index);
  /**
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   *
   * <code>repeated string whitelist_regexp = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the whitelistRegexp at the given index.
   */
  com.google.protobuf.ByteString
      getWhitelistRegexpBytes(int index);

  /**
   * <code>repeated .jscomp.Requirement.WhitelistEntry whitelist_entry = 14;</code>
   */
  java.util.List<com.google.javascript.jscomp.Requirement.WhitelistEntry> 
      getWhitelistEntryList();
  /**
   * <code>repeated .jscomp.Requirement.WhitelistEntry whitelist_entry = 14;</code>
   */
  com.google.javascript.jscomp.Requirement.WhitelistEntry getWhitelistEntry(int index);
  /**
   * <code>repeated .jscomp.Requirement.WhitelistEntry whitelist_entry = 14;</code>
   */
  int getWhitelistEntryCount();
  /**
   * <code>repeated .jscomp.Requirement.WhitelistEntry whitelist_entry = 14;</code>
   */
  java.util.List<? extends com.google.javascript.jscomp.Requirement.WhitelistEntryOrBuilder> 
      getWhitelistEntryOrBuilderList();
  /**
   * <code>repeated .jscomp.Requirement.WhitelistEntry whitelist_entry = 14;</code>
   */
  com.google.javascript.jscomp.Requirement.WhitelistEntryOrBuilder getWhitelistEntryOrBuilder(
      int index);

  /**
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   *
   * <code>repeated string only_apply_to = 4;</code>
   * @return A list containing the onlyApplyTo.
   */
  java.util.List<java.lang.String>
      getOnlyApplyToList();
  /**
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   *
   * <code>repeated string only_apply_to = 4;</code>
   * @return The count of onlyApplyTo.
   */
  int getOnlyApplyToCount();
  /**
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   *
   * <code>repeated string only_apply_to = 4;</code>
   * @param index The index of the element to return.
   * @return The onlyApplyTo at the given index.
   */
  java.lang.String getOnlyApplyTo(int index);
  /**
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   *
   * <code>repeated string only_apply_to = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the onlyApplyTo at the given index.
   */
  com.google.protobuf.ByteString
      getOnlyApplyToBytes(int index);

  /**
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   *
   * <code>repeated string only_apply_to_regexp = 5;</code>
   * @return A list containing the onlyApplyToRegexp.
   */
  java.util.List<java.lang.String>
      getOnlyApplyToRegexpList();
  /**
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   *
   * <code>repeated string only_apply_to_regexp = 5;</code>
   * @return The count of onlyApplyToRegexp.
   */
  int getOnlyApplyToRegexpCount();
  /**
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   *
   * <code>repeated string only_apply_to_regexp = 5;</code>
   * @param index The index of the element to return.
   * @return The onlyApplyToRegexp at the given index.
   */
  java.lang.String getOnlyApplyToRegexp(int index);
  /**
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   *
   * <code>repeated string only_apply_to_regexp = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the onlyApplyToRegexp at the given index.
   */
  com.google.protobuf.ByteString
      getOnlyApplyToRegexpBytes(int index);

  /**
   * <pre>
   * Required: The type of requirement.
   * </pre>
   *
   * <code>optional .jscomp.Requirement.Type type = 6;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Required: The type of requirement.
   * </pre>
   *
   * <code>optional .jscomp.Requirement.Type type = 6;</code>
   * @return The type.
   */
  com.google.javascript.jscomp.Requirement.Type getType();

  /**
   * <pre>
   * The value banned, optional for "custom" requirements.  Some custom
   * requirements repurpose this for different purposes, such as for whitelists
   * of types.
   * </pre>
   *
   * <code>repeated string value = 7;</code>
   * @return A list containing the value.
   */
  java.util.List<java.lang.String>
      getValueList();
  /**
   * <pre>
   * The value banned, optional for "custom" requirements.  Some custom
   * requirements repurpose this for different purposes, such as for whitelists
   * of types.
   * </pre>
   *
   * <code>repeated string value = 7;</code>
   * @return The count of value.
   */
  int getValueCount();
  /**
   * <pre>
   * The value banned, optional for "custom" requirements.  Some custom
   * requirements repurpose this for different purposes, such as for whitelists
   * of types.
   * </pre>
   *
   * <code>repeated string value = 7;</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  java.lang.String getValue(int index);
  /**
   * <pre>
   * The value banned, optional for "custom" requirements.  Some custom
   * requirements repurpose this for different purposes, such as for whitelists
   * of types.
   * </pre>
   *
   * <code>repeated string value = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the value at the given index.
   */
  com.google.protobuf.ByteString
      getValueBytes(int index);

  /**
   * <pre>
   * Whether to allow subconfigs to extend the "value" field.  This does not
   * make sense for banning values, but when the value is used as a whitelist,
   * it becomes important.
   * </pre>
   *
   * <code>optional bool allow_extending_value = 15;</code>
   * @return Whether the allowExtendingValue field is set.
   */
  boolean hasAllowExtendingValue();
  /**
   * <pre>
   * Whether to allow subconfigs to extend the "value" field.  This does not
   * make sense for banning values, but when the value is used as a whitelist,
   * it becomes important.
   * </pre>
   *
   * <code>optional bool allow_extending_value = 15;</code>
   * @return The allowExtendingValue.
   */
  boolean getAllowExtendingValue();

  /**
   * <pre>
   * Strategy to use for matching types in the value parameter (e.g. for
   * BANNED_CODE_PATTERN checks).
   * </pre>
   *
   * <code>optional .jscomp.Requirement.TypeMatchingStrategy type_matching_strategy = 13 [default = LOOSE];</code>
   * @return Whether the typeMatchingStrategy field is set.
   */
  boolean hasTypeMatchingStrategy();
  /**
   * <pre>
   * Strategy to use for matching types in the value parameter (e.g. for
   * BANNED_CODE_PATTERN checks).
   * </pre>
   *
   * <code>optional .jscomp.Requirement.TypeMatchingStrategy type_matching_strategy = 13 [default = LOOSE];</code>
   * @return The typeMatchingStrategy.
   */
  com.google.javascript.jscomp.Requirement.TypeMatchingStrategy getTypeMatchingStrategy();

  /**
   * <pre>
   * For "custom" requirements, the Java class used to enforce the requirement.
   * Ignored otherwise.
   * </pre>
   *
   * <code>optional string java_class = 8;</code>
   * @return Whether the javaClass field is set.
   */
  boolean hasJavaClass();
  /**
   * <pre>
   * For "custom" requirements, the Java class used to enforce the requirement.
   * Ignored otherwise.
   * </pre>
   *
   * <code>optional string java_class = 8;</code>
   * @return The javaClass.
   */
  java.lang.String getJavaClass();
  /**
   * <pre>
   * For "custom" requirements, the Java class used to enforce the requirement.
   * Ignored otherwise.
   * </pre>
   *
   * <code>optional string java_class = 8;</code>
   * @return The bytes for javaClass.
   */
  com.google.protobuf.ByteString
      getJavaClassBytes();

  /**
   * <pre>
   * Gives the rule an unique ID that can be used for extending in other rules
   * through 'extends'. An example of ID is 'closure:innerHtml'.
   * </pre>
   *
   * <code>optional string rule_id = 9;</code>
   * @return Whether the ruleId field is set.
   */
  boolean hasRuleId();
  /**
   * <pre>
   * Gives the rule an unique ID that can be used for extending in other rules
   * through 'extends'. An example of ID is 'closure:innerHtml'.
   * </pre>
   *
   * <code>optional string rule_id = 9;</code>
   * @return The ruleId.
   */
  java.lang.String getRuleId();
  /**
   * <pre>
   * Gives the rule an unique ID that can be used for extending in other rules
   * through 'extends'. An example of ID is 'closure:innerHtml'.
   * </pre>
   *
   * <code>optional string rule_id = 9;</code>
   * @return The bytes for ruleId.
   */
  com.google.protobuf.ByteString
      getRuleIdBytes();

  /**
   * <pre>
   * Allows extending whitelists of rules with the specified rule_id. If this
   * field is specified then all fields except whitelist, whitelist_regexp,
   * only_apply_to and only_apply_to_regexp are ignored.
   * </pre>
   *
   * <code>optional string extends = 10;</code>
   * @return Whether the extends field is set.
   */
  boolean hasExtends();
  /**
   * <pre>
   * Allows extending whitelists of rules with the specified rule_id. If this
   * field is specified then all fields except whitelist, whitelist_regexp,
   * only_apply_to and only_apply_to_regexp are ignored.
   * </pre>
   *
   * <code>optional string extends = 10;</code>
   * @return The extends.
   */
  java.lang.String getExtends();
  /**
   * <pre>
   * Allows extending whitelists of rules with the specified rule_id. If this
   * field is specified then all fields except whitelist, whitelist_regexp,
   * only_apply_to and only_apply_to_regexp are ignored.
   * </pre>
   *
   * <code>optional string extends = 10;</code>
   * @return The bytes for extends.
   */
  com.google.protobuf.ByteString
      getExtendsBytes();

  /**
   * <pre>
   * Whether to report possible violations when type information is not exact.
   * Normally, violations on parent types are reported as possible violations.
   * This field allows to ignore them and report only violations on exact types.
   * This changes the balance between the false positives and the false
   * negatives. With the default value, there might be lots of false positives
   * (possible violations) but there shouldn't be any false negatives. Without
   * reporting the loose type violations, there will be less false positives but
   * there can also be false negatives (an actual violation that is not
   * reported).
   * </pre>
   *
   * <code>optional bool report_loose_type_violations = 11 [default = true];</code>
   * @return Whether the reportLooseTypeViolations field is set.
   */
  boolean hasReportLooseTypeViolations();
  /**
   * <pre>
   * Whether to report possible violations when type information is not exact.
   * Normally, violations on parent types are reported as possible violations.
   * This field allows to ignore them and report only violations on exact types.
   * This changes the balance between the false positives and the false
   * negatives. With the default value, there might be lots of false positives
   * (possible violations) but there shouldn't be any false negatives. Without
   * reporting the loose type violations, there will be less false positives but
   * there can also be false negatives (an actual violation that is not
   * reported).
   * </pre>
   *
   * <code>optional bool report_loose_type_violations = 11 [default = true];</code>
   * @return The reportLooseTypeViolations.
   */
  boolean getReportLooseTypeViolations();

  /**
   * <code>optional .jscomp.Requirement.Severity severity = 12 [default = WARNING];</code>
   * @return Whether the severity field is set.
   */
  boolean hasSeverity();
  /**
   * <code>optional .jscomp.Requirement.Severity severity = 12 [default = WARNING];</code>
   * @return The severity.
   */
  com.google.javascript.jscomp.Requirement.Severity getSeverity();
}
