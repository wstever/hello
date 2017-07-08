package KnapsackProblem;

public class Knapsack {
	private int weight; // 背包重量
	private int value; // 背包物品价值

	public Knapsack(int weight, int value) { // 构造器
		this.value = value;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "[weight: " + weight + " " + "value: " + value + "]";
	}
}