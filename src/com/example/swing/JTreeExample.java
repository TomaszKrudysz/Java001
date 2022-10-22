package com.example.swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JTreeExample extends JFrame {
    public static void main(String[] args) {
        JTreeExample frame = new JTreeExample();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        JTree tree = new JTree(root);

        DefaultMutableTreeNode cars = new DefaultMutableTreeNode("cars");
        cars.add(new DefaultMutableTreeNode("Ford"));
        cars.add(new DefaultMutableTreeNode("Doge"));
        cars.add(new DefaultMutableTreeNode("Pontiac"));
        root.add(cars);

        DefaultMutableTreeNode bikes = new DefaultMutableTreeNode("bikes");
        bikes.add(new DefaultMutableTreeNode("Honda"));
        bikes.add(new DefaultMutableTreeNode("BMW"));
        root.add(bikes);
        for (int i = 0; i < tree.getRowCount(); i++) { //otwiera wszystkie galezie
            tree.expandRow(i);
        };

        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                Object el = e.getNewLeadSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) el;
                System.out.println("selected: " + node.toString());
            }
        });
        frame.add(tree);


    //    frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
