package com.maimai.myspringboot.entity;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSONObject;

/** 
* @author YJJ
* @version 2018年11月2日 下午4:50:26
*/

public class TreeBuilder {

    List<Node> nodes = new ArrayList<>();

    public String buildTree(List<Node> nodes) {

        TreeBuilder treeBuilder = new TreeBuilder(nodes);

        return treeBuilder.buildJSONTree();
    }

    public TreeBuilder() {}

    public TreeBuilder(List<Node> nodes) {

        super();
        this.nodes = nodes;
    }

    // 构建JSON树形结构
    public String buildJSONTree() {

        List<Node> nodeTree = buildTree();


        String jsonString = JSONObject.toJSONString(nodeTree);


        return jsonString;
    }

    // 构建树形结构
    public List<Node> buildTree() {

        List<Node> treeNodes = new ArrayList<>();
        List<Node> rootNodes = getRootNodes();
        for (Node rootNode : rootNodes) {
            buildChildNodes(rootNode);
            treeNodes.add(rootNode);
        }
        return treeNodes;
    }

    // 递归子节点
    public void buildChildNodes(Node node) {

        List<Node> children = getChildNodes(node);
        if (!children.isEmpty()) {
            for (Node child : children) {
                buildChildNodes(child);
            }
            node.setChildren(children);
        }
    }

    // 获取父节点下所有的子节点
    public List<Node> getChildNodes(Node pnode) {

        List<Node> childNodes = new ArrayList<>();
        for (Node n : nodes) {
            if (pnode.getId().equals(n.getPid())) {
                childNodes.add(n);
            }
        }
        return childNodes;
    }

    // 判断是否为根节点
    public boolean rootNode(Node node) {

        boolean isRootNode = true;
        for (Node n : nodes) {
            if (node.getPid().equals(n.getId())) {
                isRootNode = false;
                break;
            }
        }
        return isRootNode;
    }

    // 获取集合中所有的根节点
    public List<Node> getRootNodes() {

        List<Node> rootNodes = new ArrayList<>();
        for (Node n : nodes) {
            if (rootNode(n)) {
                rootNodes.add(n);
            }
        }
        return rootNodes;
    }


}
