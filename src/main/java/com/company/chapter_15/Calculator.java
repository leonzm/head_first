package com.company.chapter_15;

import com.company.chapter_15.impl.DivNode;
import com.company.chapter_15.impl.ModNode;
import com.company.chapter_15.impl.MulNode;
import com.company.chapter_15.impl.ValueNode;

import java.util.Stack;

/**
 * 计算器
 *
 * @author Leon
 * @date 2019/7/14
 * @description
 */
public class Calculator {

    private Node node;

    public void build(String statement) {
        Stack<Node> stack = new Stack<>();

        String[] statementArray = statement.split(" ");
        for (int i = 0; i < statementArray.length; i++) {
            if (statementArray[i].equalsIgnoreCase("*")) {  // 非终结点（乘法）
                Node left = stack.pop();
                int val = Integer.parseInt(statementArray[++i]);
                Node right = new ValueNode(val);
                stack.push(new MulNode(left, right));
            } else if (statementArray[i].equalsIgnoreCase("/")) {  // 非终结点（除法）
                Node left = stack.pop();
                int val = Integer.parseInt(statementArray[++i]);
                Node right = new ValueNode(val);
                stack.push(new DivNode(left, right));
            } else if (statementArray[i].equalsIgnoreCase("%")) {  // 非终结点（取模）
                Node left = stack.pop();
                int val = Integer.parseInt(statementArray[++i]);
                Node right = new ValueNode(val);
                stack.push(new ModNode(left, right));
            } else {  // 终结点（具体的值）
                stack.push(new ValueNode(Integer.parseInt(statementArray[i])));
            }
        }
        this.node = stack.pop();
    }

    /**
     * 计算
     *
     * @return
     */
    public int compute() {
        return node.interpret();
    }

}
