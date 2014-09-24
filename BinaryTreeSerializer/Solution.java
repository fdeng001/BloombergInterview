package BinaryTreeSerializer;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<Integer> Serialize(BTNode root)
    {
        List<Integer> serializedNums = new ArrayList<Integer>();

        SerializeRecursively(root, serializedNums);

        return serializedNums;
    }

    private static void SerializeRecursively(BTNode node, List<Integer> nums)
    {
        if (node == null)
        {
            nums.add(0);
            return;
        }

        nums.add(node.data);
        SerializeRecursively(node.left, nums);
        SerializeRecursively(node.right, nums);
    }

    public static BTNode Deserialize(List<Integer> serializedNums)
    {
        Pair pair = DeserializeRecursively(serializedNums, 0);

        return pair.node;
    }

    private static Pair DeserializeRecursively(List<Integer> serializedNums, int start)
    {        
        int num = serializedNums.get(start);

        if (num == 0)
        {
            return new Pair(null, start + 1);
        }

        BTNode node = new BTNode(num);

        Pair p1 = DeserializeRecursively(serializedNums, start + 1);
        node.left = p1.node;

        Pair p2 = DeserializeRecursively(serializedNums, p1.startIndex);
        node.right = p2.node;

        return new Pair(node, p2.startIndex);
    }

    private static final class Pair
    {
        BTNode node;
        int startIndex;

        private Pair(BTNode node, int index)
        {
            this.node = node;
            this.startIndex = index;
        }
    }
}
class BTNode 
{
    public int data;
    public BTNode left;
    public BTNode right;

    public BTNode(int data)
    {
        this.data = data;
    }
}