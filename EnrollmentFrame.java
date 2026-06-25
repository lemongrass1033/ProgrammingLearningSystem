<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.5" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="3"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Component id="jScrollPane1" alignment="1" pref="500" max="32767" attributes="0"/>
          <Group type="102" alignment="0" attributes="0">
              <Component id="jCompletionList" min="-2" pref="156" max="-2" attributes="0"/>
              <EmptySpace min="0" pref="0" max="32767" attributes="0"/>
          </Group>
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" attributes="0">
                      <EmptySpace max="32767" attributes="0"/>
                      <Group type="103" groupAlignment="0" max="-2" attributes="0">
                          <Component id="jViewStatus" max="32767" attributes="0"/>
                          <Component id="jUpdateStatus" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="127" max="-2" attributes="0"/>
                      <Component id="btnBack" min="-2" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="25" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" max="-2" attributes="0">
                          <Component id="jEnrollID" max="32767" attributes="0"/>
                          <Component id="jCompletionPercentage" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="29" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" max="-2" attributes="0">
                          <Component id="txtCompletionPercentage" pref="205" max="32767" attributes="0"/>
                          <Component id="jTextEnrollID" max="32767" attributes="0"/>
                      </Group>
                      <EmptySpace min="0" pref="0" max="32767" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <Component id="jCompletionList" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="jScrollPane1" pref="268" max="32767" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="jEnrollID" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="jTextEnrollID" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="jCompletionPercentage" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="txtCompletionPercentage" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace max="32767" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace min="-2" pref="78" max="-2" attributes="0"/>
                      <Component id="btnBack" min="-2" max="-2" attributes="0"/>
                      <EmptySpace max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" attributes="0">
                      <EmptySpace min="-2" pref="25" max="-2" attributes="0"/>
                      <Component id="jUpdateStatus" min="-2" max="-2" attributes="0"/>
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="jViewStatus" min="-2" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="22" max="-2" attributes="0"/>
                  </Group>
              </Group>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="jEnrollID">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Enrollment ID                            :"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jCompletionPercentage">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Completion Percentage (%)       :"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="jTextEnrollID">
    </Component>
    <Component class="javax.swing.JButton" name="jUpdateStatus">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Update Status"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jUpdateStatusActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="jViewStatus">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="View Status"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jViewStatusActionPerformed"/>
      </Events>
    </Component>
    <Container class="javax.swing.JScrollPane" name="jScrollPane1">

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTable" name="jCompletionTable">
          <Properties>
            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
              <Table columnCount="4" rowCount="20">
                <Column editable="true" title="No" type="java.lang.Integer"/>
                <Column editable="true" title="Status ID" type="java.lang.Integer"/>
                <Column editable="true" title="Enrollment ID" type="java.lang.Integer"/>
                <Column editable="true" title="Completion Status" type="java.lang.String"/>
              </Table>
            </Property>
            <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
              <TableColumnModel selectionModel="0">
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
              </TableColumnModel>
            </Property>
            <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
              <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
            </Property>
          </Properties>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JLabel" name="jCompletionList">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI Black" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Completion List"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="txtCompletionPercentage">
    </Component>
    <Component class="javax.swing.JButton" name="btnBack">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Back"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnBackActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>
