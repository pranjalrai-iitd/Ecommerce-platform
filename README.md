# Ecommerce Platform

This is one of the assignments I submitted for my course on ***Data Strucutres and Algorithms*** at ***IIT Delhi***. The problem solution was inspired from classic ***Producer-Consumer*** problem and used ***rentrant locks*** and ***multithreading***.

## Problem Statement

Suppose you have decided to build your own online selling platform known as Amazing.com. You have multiple sellers and buyers registered with Amazing.com. It has open access for both buyers and sellers. The sellers add the items to the catalog and once the buyers make a purchase from the catalog, the corresponding item is removed from the catalog. For the sake of simplicity, you may assume all the items are of a single type such as books or shoes. You listed some sellers as “preferred” sellers who have donated you some money. The preferred sellers have been given a priority order based on the amount they have donated you. When buyers make a purchase, they would always be delivered an item listed by a seller who is higher in the priority order. For example assume sellers s1, s2, and s3 have listed their books in the catalog. Also assume the priority order as s1 > s2 > s3 (s1 is most preferred). Now buyers have to first purchase all the items listed by s1 before making a purchase from other sellers. Further, consider a situation where a buyer is buying from s2 after all the items listed by s1 exhausted. In the meantime s1 again adds some items to the catalog. Once the current purchase from s2 completes, the next buyer must buy the item(s) listed by s1 before buying from any other seller. 

You may assume that the priorities are unique (no duplicates) and non-negative. In the starter code, the priorities are given as simple integers. Assume the lower number to be of higher priority. Being a student you’re on a budget and can’t afford expensive infrastructure. As a result, you have very limited space for the catalog. At any time at most N items can be stored in the catalog. If the catalog is already full, then the sellers need to wait for some buyers to buy items before they can add their product to the catalog. Also, if the catalog is empty, then the buyers need to wait until a seller adds their items to the catalog.

Your task is to implement the Seller and Buyer classes using Java Threads.

## References
- Prof. Subodh Kumar, IIT Delhi (http://www.cse.iitd.ac.in/~subodh/)
