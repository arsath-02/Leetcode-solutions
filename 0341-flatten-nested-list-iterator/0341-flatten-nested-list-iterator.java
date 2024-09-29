/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private List<Integer> flatlist;
    private Iterator<Integer> flatiterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        flatlist=new ArrayList<>();
        flatten(nestedList);

        flatiterator = flatlist.iterator();
    }
    public void flatten(List<NestedInteger> nestedList){
        for(NestedInteger n:nestedList){
            if(n.isInteger()){
                flatlist.add(n.getInteger());
            }
            else{
                flatten(n.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return flatiterator.next();
    }

    @Override
    public boolean hasNext() {
        return flatiterator.hasNext();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */