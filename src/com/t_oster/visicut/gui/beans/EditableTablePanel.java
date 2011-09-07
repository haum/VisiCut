/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditableTablePanel.java
 *
 * Created on 07.09.2011, 18:31:49
 */
package com.t_oster.visicut.gui.beans;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thommy
 */
public class EditableTablePanel extends javax.swing.JPanel
{

  /** Creates new form EditableTablePanel */
  public EditableTablePanel()
  {
    initComponents();
    this.table.setModel(this.getTableModel());
  }
  protected EditableTableProvider provider = null;
  public static final String PROP_PROVIDER = "provider";

  /**
   * Get the value of provider
   *
   * @return the value of provider
   */
  public EditableTableProvider getProvider()
  {
    return provider;
  }

  /**
   * Set the value of provider
   *
   * @param provider new value of provider
   */
  public void setProvider(EditableTableProvider provider)
  {
    EditableTableProvider oldProvider = this.provider;
    this.provider = provider;
    firePropertyChange(PROP_PROVIDER, oldProvider, provider);
  }
  protected DefaultTableModel tableModel = new DefaultTableModel()
  {

    private String[] columns = new String[]
    {
      "Elements"
    };

    @Override
    public int getColumnCount()
    {
      return columns.length;
    }

    @Override
    public String getColumnName(int i)
    {
      return columns[i];
    }

    @Override
    public int getRowCount()
    {
      return EditableTablePanel.this.objects == null ? 0 : EditableTablePanel.this.objects.size();
    }

    @Override
    public Object getValueAt(int y, int x)
    {
      return EditableTablePanel.this.objects.get(y);
    }

    @Override
    public boolean isCellEditable(int i, int i1)
    {
      return false;
    }
  };
  public static final String PROP_TABLEMODEL = "tableModel";

  /**
   * Get the value of tableModel
   *
   * @return the value of tableModel
   */
  public DefaultTableModel getTableModel()
  {
    return tableModel;
  }

  /**
   * Set the value of tableModel.
   * The TableModel is used to generate the contents
   * of the table. If an Object is set to be deleted,
   * the Models fireProperty Change method will be used.
   *
   * @param tableModel new value of tableModel
   */
  public void setTableModel(DefaultTableModel tableModel)
  {
    DefaultTableModel oldTableModel = this.tableModel;
    this.tableModel = tableModel;
    firePropertyChange(PROP_TABLEMODEL, oldTableModel, tableModel);
    this.table.setModel(tableModel);
  }
  protected List<Object> objects = new LinkedList<Object>();
  ;

    public static final String PROP_OBJECTS = "objects";

  /**
   * Get the value of objects
   *
   * @return the value of objects
   */
  public List<Object> getObjects()
  {
    return objects;
  }

  /**
   * Set the value of objects
   *
   * @param objects new value of objects
   */
  public void setObjects(List<Object> objects)
  {
    List<Object> oldObjects = this.objects;
    this.objects = objects;
    firePropertyChange(PROP_OBJECTS, oldObjects, objects);
    this.tableModel.fireTableDataChanged();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    table = new javax.swing.JTable();
    addButton = new javax.swing.JButton();
    removeButton = new javax.swing.JButton();
    editButton = new javax.swing.JButton();

    setName("Form"); // NOI18N

    jScrollPane1.setName("jScrollPane1"); // NOI18N

    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    table.setName("table"); // NOI18N
    jScrollPane1.setViewportView(table);

    org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.t_oster.visicut.gui.VisicutApp.class).getContext().getResourceMap(EditableTablePanel.class);
    addButton.setText(resourceMap.getString("addButton.text")); // NOI18N
    addButton.setName("addButton"); // NOI18N
    addButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addButtonActionPerformed(evt);
      }
    });

    removeButton.setText(resourceMap.getString("removeButton.text")); // NOI18N
    removeButton.setName("removeButton"); // NOI18N
    removeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        removeButtonActionPerformed(evt);
      }
    });

    editButton.setText(resourceMap.getString("editButton.text")); // NOI18N
    editButton.setName("editButton"); // NOI18N
    editButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGroup(layout.createSequentialGroup()
        .addComponent(addButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(removeButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(editButton))
    );
  }// </editor-fold>//GEN-END:initComponents

private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
  int idx = this.table.getSelectedRow();
  if (idx >= 0)
  {
    Object o = this.objects.get(idx);
    this.objects.remove(o);
    this.tableModel.fireTableRowsDeleted(idx, idx);
  }
}//GEN-LAST:event_removeButtonActionPerformed

private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
  int idx = this.table.getSelectedRow();
  if (idx >= 0 && this.provider != null)
  {
    Object result = this.provider.editObject(this.objects.get(idx));
    if (result != null)
    {
      this.objects.set(idx, result);
      this.tableModel.fireTableRowsUpdated(idx, idx);
    }
  }
}//GEN-LAST:event_editButtonActionPerformed

private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
  if (this.provider != null)
  {
    Object n = this.provider.getNewInstance();
    if (n != null)
    {
      Object o = this.provider.editObject(n);
      if (o != null)
      {
        this.objects.add(o);
        int idx = this.objects.indexOf(o);
        this.tableModel.fireTableRowsInserted(idx, idx);
      }
    }
  }
}//GEN-LAST:event_addButtonActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton addButton;
  private javax.swing.JButton editButton;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton removeButton;
  private javax.swing.JTable table;
  // End of variables declaration//GEN-END:variables
}
