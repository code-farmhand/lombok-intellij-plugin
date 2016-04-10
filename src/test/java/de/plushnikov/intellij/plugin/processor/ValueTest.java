package de.plushnikov.intellij.plugin.processor;

import com.intellij.openapi.application.ApplicationInfo;
import com.intellij.openapi.util.BuildNumber;
import de.plushnikov.intellij.plugin.AbstractLombokParsingTestCase;

import java.io.IOException;

public class ValueTest extends AbstractLombokParsingTestCase {
  protected boolean shouldCompareModifiers() {
    return ApplicationInfo.getInstance().getBuild().compareTo(BuildNumber.fromString("146.1154")) >= 0;
  }

  protected boolean shouldCompareCodeBlocks() {
    return false;
  }

  public void testValue$ValueIssue78() throws IOException {
    doTest(true);
  }

  public void testValue$ValueIssue94() throws IOException {
    doTest(true);
  }

  public void testValue$ValuePlain() throws IOException {
    doTest(true);
  }

  public void testValue$ValueExperimental() throws IOException {
    doTest(true);
  }

  public void testValue$ValueExperimentalStarImport() throws IOException {
    doTest(true);
  }

  public void testValue$ValueBuilder() throws IOException {
    doTest(true);
  }

  public void testValue$ValueAndBuilder93() throws IOException {
    doTest(true);
  }

  public void testValue$ValueAndWither() throws IOException {
    doTest(true);
  }

  public void testValue$ValueAndWitherAndRequiredConstructor() throws IOException {
    doTest(true);
  }

  public void testValue$ValueWithGeneric176() throws IOException {
    doTest(true);
  }
}