package threeSum_15;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.*;

/**
 * @author ASUS
 * @ 2021/11/16- 11:59
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans =new List<List<Integer>>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<List<Integer>> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(List<Integer> integers) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends List<Integer>> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends List<Integer>> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public List<Integer> get(int index) {
                return null;
            }

            @Override
            public List<Integer> set(int index, List<Integer> element) {
                return null;
            }

            @Override
            public void add(int index, List<Integer> element) {

            }

            @Override
            public List<Integer> remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<List<Integer>> listIterator() {
                return null;
            }

            @Override
            public ListIterator<List<Integer>> listIterator(int index) {
                return null;
            }

            @Override
            public List<List<Integer>> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])break;
            for(int j=i+1,k=nums.length-1;j<k;j++){
                while (nums[i])
            }

        }

     return ans;
    }

}
