/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fintechtradingmanagement;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class FinTechTradingManagement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // =========================================================
        // MARKET ASSETS
        // =========================================================
        Asset[] asset = new Asset[10];
        asset[0] = new Asset(101, "Apple", "Stock", 225.50, 1.25);
        asset[1] = new Asset(102, "Tesla", "Stock", 340.20, -0.85);
        asset[2] = new Asset(103, "Bitcoin", "Crypto", 65000.00, 2.10);
        asset[3] = new Asset(104, "Amazon", "Stock", 195.75, 0.65);
        asset[4] = new Asset(105, "Microsoft", "Stock", 425.30, 1.45);
        asset[5] = new Asset(106, "Ethereum", "Crypto", 3500.80, -1.20);
        asset[6] = new Asset(107, "Google", "Stock", 175.40, 0.90);
        asset[7] = new Asset(108, "NVIDIA", "Stock", 120.60, 3.15);
        asset[8] = new Asset(109, "Meta", "Stock", 565.25, -0.50);
        asset[9] = new Asset(110, "Netflix", "Stock", 685.90, 2.35);
        int[] quantities = new int[10];
        quantities[0] = 5;
        quantities[1] = 2;
        quantities[2] = 1;
        quantities[3] = 4;
        quantities[4] = 3;
        quantities[5] = 2;
        quantities[6] = 5;
        quantities[7] = 10;
        quantities[8] = 2;
        quantities[9] = 1;
        portFolio p =new portFolio(asset, quantities);
        TransactionStack ts = new TransactionStack(10);
        TradingQueue tq = new TradingQueue(10);
        int mainChoice;
        
        // =========================================================
        // MAIN MENU
        // =========================================================
        do {
            System.out.println();
            System.out.println("==============================================");
            System.out.println("       FINTECH TRADING MANAGEMENT SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Manage Market Assets");
            System.out.println("2. Search Assets");
            System.out.println("3. Sort Market Assets");
            System.out.println("4. Manage WatchList");
            System.out.println("5. Calculate Portfolio Value");
            System.out.println("6. Manage Transactions");
            System.out.println("7. Manage Trading Orders");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            mainChoice = in.nextInt();
            // =====================================================
            // MAIN MENU SWITCH
            // =====================================================
            switch (mainChoice) {
                // =================================================
                // 1. MANAGE MARKET ASSETS
                // =================================================
                case 1:
                    int assetChoice;
                    do {
                        System.out.println();
                        System.out.println("==============================================");
                        System.out.println("          MANAGE MARKET ASSETS");
                        System.out.println("==============================================");

                        System.out.println("1. Display All Assets");
                        System.out.println("2. Calculate Average Price");
                        System.out.println("3. Find Highest Priced Asset");
                        System.out.println("4. Find Lowest Priced Asset");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        assetChoice = in.nextInt();
                        switch (assetChoice) {
                            // -------------------------------------
                            // 1. DISPLAY ALL ASSETS
                            // -------------------------------------
                            case 1:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("              ALL MARKET ASSETS");
                                System.out.println("==============================================");
                                for (int i = 0; i < asset.length; i++) 
                                {
                                    System.out.println("Asset ID: "+asset[i].getAssetID());
                                    System.out.println("Asset Name: "+asset[i].getAssetName());
                                    System.out.println("Asset Type: "+asset[i].getAssetType());
                                    System.out.println("Current Price: "+asset[i].getCurrentPrice());
                                    System.out.println("Percentage Change: "+asset[i].getPercentageChange() + "%");
                                    System.out.println("----------------------------------------------");
                                }
                                break;
                            // -------------------------------------
                            // 2. AVERAGE PRICE
                            // -------------------------------------
                            case 2:
                                double totalPrice = 0;
                                for (int i = 0; i < asset.length; i++) 
                                {
                                    totalPrice = totalPrice+asset[i].getCurrentPrice();
                                }
                                double averagePrice =totalPrice / asset.length;
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("             AVERAGE PRICE");
                                System.out.println("==============================================");
                                System.out.println("Average Price: "+averagePrice);
                                break;
                            // -------------------------------------
                            // 3. HIGHEST PRICED ASSET
                            // -------------------------------------
                            case 3:
                                Asset highest = asset[0];
                                for (int i = 1; i < asset.length; i++)
                                {
                                    if (asset[i].getCurrentPrice()>highest.getCurrentPrice())
                                    {
                                        highest = asset[i];
                                    }
                                }
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("          HIGHEST PRICED ASSET");
                                System.out.println("==============================================");
                                System.out.println("Asset ID: "+highest.getAssetID());
                                System.out.println("Asset Name: "+highest.getAssetName());
                                System.out.println("Asset Type: "+highest.getAssetType());
                                System.out.println("Current Price: "+highest.getCurrentPrice());
                                break;
                            // -------------------------------------
                            // 4. LOWEST PRICED ASSET
                            // -------------------------------------
                            case 4:
                                Asset lowest = asset[0];
                                for (int i = 1; i < asset.length; i++) 
                                {
                                    if (asset[i].getCurrentPrice()<lowest.getCurrentPrice())
                                    {
                                        lowest = asset[i];
                                    }
                                }
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("           LOWEST PRICED ASSET");
                                System.out.println("==============================================");
                                System.out.println("Asset ID: "+lowest.getAssetID());
                                System.out.println("Asset Name: "+lowest.getAssetName());
                                System.out.println("Asset Type: "+lowest.getAssetType());
                                System.out.println("Current Price: "+lowest.getCurrentPrice());
                                break;
                            // -------------------------------------
                            // BACK
                            // -------------------------------------
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (assetChoice != 0);
                    break;
                // =================================================
                // 2. SEARCH ASSETS
                // =================================================
                case 2:
                    int searchChoice;
                    do {
                        System.out.println();
                        System.out.println("==============================================");
                        System.out.println("              SEARCH ASSETS");
                        System.out.println("==============================================");
                        System.out.println("1. Linear Search");
                        System.out.println("2. Binary Search");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("\nEnter your choice: ");
                        searchChoice = in.nextInt();
                        switch (searchChoice) {
                            // -------------------------------------
                            // LINEAR SEARCH
                            // -------------------------------------
                            case 1:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("               LINEAR SEARCH");
                                System.out.println("==============================================");
                                System.out.print("Enter Asset ID: ");
                                int targetID = in.nextInt();
                                Asset result =searchAlgorithms.LinearSearch(asset,targetID);
                                if (result != null) 
                                {
                                    System.out.println();
                                    System.out.println("===== Asset Found =====");
                                    System.out.println("Asset ID: "+result.getAssetID());
                                    System.out.println("Asset Name: "+result.getAssetName());
                                    System.out.println("Asset Type: "+result.getAssetType());
                                    System.out.println("Current Price: "+result.getCurrentPrice());
                                    System.out.println("Percentage Change: "+result.getPercentageChange()+"%");
                                } 
                                else 
                                {
                                    System.out.println("Asset not found.");
                                }
                                break;
                            // -------------------------------------
                            // BINARY SEARCH
                            // -------------------------------------
                            case 2:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("               BINARY SEARCH");
                                System.out.println("==============================================");
                                System.out.print("Enter Asset ID: ");
                                int binaryTargetID = in.nextInt();
                                Asset binaryResult =searchAlgorithms.binarySearch(asset,binaryTargetID);
                                if (binaryResult != null) 
                                {
                                    System.out.println();
                                    System.out.println("===== Asset Found =====");
                                    System.out.println("Asset ID: "+binaryResult.getAssetID());
                                    System.out.println("Asset Name: "+binaryResult.getAssetName());
                                    System.out.println("Asset Type: "+binaryResult.getAssetType());
                                    System.out.println("Current Price: "+binaryResult.getCurrentPrice());
                                    System.out.println("Percentage Change: "+binaryResult.getPercentageChange()+"%");
                                }
                                else
                                {
                                    System.out.println("Asset not found.");
                                }
                                break;
                            // -------------------------------------
                            // BACK
                            // -------------------------------------
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (searchChoice != 0);
                    break;
                // =================================================
                // 3. SORT MARKET ASSETS
                // =================================================
                case 3:
                    int sortChoice;
                    do {
                        System.out.println();
                        System.out.println("==============================================");
                        System.out.println("             SORT MARKET ASSETS");
                        System.out.println("==============================================");

                        System.out.println("1. Bubble Sort");
                        System.out.println("2. Selection Sort");
                        System.out.println("3. Insertion Sort");
                        System.out.println("4. Merge Sort");
                        System.out.println("5. Quick Sort");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        sortChoice = in.nextInt();
                        switch (sortChoice) {
                            // -------------------------------------
                            // BUBBLE SORT
                            // -------------------------------------
                            case 1:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("                BUBBLE SORT");
                                System.out.println("==============================================");
                                Asset[] bubbleArray = asset.clone();
                                sortingAlgorithms.bubbleSort(bubbleArray);
                                for (int i = 0;i < bubbleArray.length;i++)
                                {
                                    System.out.println(bubbleArray[i].getAssetName()+" - "+bubbleArray[i].getCurrentPrice());
                                }
                                break;
                            // -------------------------------------
                            // SELECTION SORT
                            // -------------------------------------
                            case 2:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("              SELECTION SORT");
                                System.out.println("==============================================");
                                Asset[] selectionArray =asset.clone();
                                sortingAlgorithms.selectionSort(selectionArray);
                                for (int i = 0;i < selectionArray.length;i++) 
                                {
                                    System.out.println(selectionArray[i].getAssetName()+" - "+selectionArray[i].getCurrentPrice()
                                    );
                                }
                                break;
                            // -------------------------------------
                            // INSERTION SORT
                            // -------------------------------------
                            case 3:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("              INSERTION SORT");
                                System.out.println("==============================================");
                                Asset[] insertionArray =asset.clone();
                                sortingAlgorithms.insertionSort(insertionArray);
                                for (int i = 0;i < insertionArray.length;i++)
                                {
                                    System.out.println(insertionArray[i].getAssetName()+" - "+insertionArray[i].getCurrentPrice());
                                }
                                break;
                            // -------------------------------------
                            // MERGE SORT
                            // -------------------------------------
                            case 4:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("                MERGE SORT");
                                System.out.println("==============================================");
                                Asset[] mergeArray =asset.clone();
                                sortingAlgorithms.mergeSort(mergeArray,0,mergeArray.length - 1);
                                for (int i = 0;i < mergeArray.length;i++)
                                {
                                    System.out.println(mergeArray[i].getAssetName()+" - "+mergeArray[i].getCurrentPrice());
                                }
                                break;
                            // -------------------------------------
                            // QUICK SORT
                            // -------------------------------------
                            case 5:
                                System.out.println();
                                System.out.println("==============================================");
                                System.out.println("                QUICK SORT");
                                System.out.println("==============================================");
                                Asset[] quickArray =asset.clone();
                                sortingAlgorithms.quickSort(quickArray,0,quickArray.length - 1);
                                for (int i = 0;i<quickArray.length;i++)
                                {
                                    System.out.println(quickArray[i].getAssetName()+" - "+quickArray[i].getCurrentPrice());
                                }
                                break;
                            // -------------------------------------
                            // BACK
                            // -------------------------------------
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (sortChoice != 0);
                    break;
                // =================================================
                // 4. MANAGE WATCHLIST
                // =================================================
                case 4:
                    int watchChoice;
                    do {
                        System.out.println();
                        System.out.println("==============================================");
                        System.out.println("             MANAGE WATCHLIST");
                        System.out.println("==============================================");
                        System.out.println("1. Singly Linked List");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        watchChoice = in.nextInt();
                        switch (watchChoice) {
                            // -------------------------------------
                            // SINGLY LINKED LIST
                            // -------------------------------------
                            case 1:
                                int listChoice;
                                WatchList watchList =new WatchList();
                                // Insert assets into WatchList
                                watchList.insert(asset[0]);
                                watchList.insert(asset[1]);
                                watchList.insert(asset[2]);
                                watchList.insert(asset[3]);
                                watchList.insert(asset[4]);
                                watchList.insert(asset[5]);
                                watchList.insert(asset[6]);
                                watchList.insert(asset[7]);
                                watchList.insert(asset[8]);
                                watchList.insert(asset[9]);
                                do {
                                    System.out.println();
                                    System.out.println("----------------------------------------------");
                                    System.out.println("          SINGLY LINKED LIST");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("1. Insert");
                                    System.out.println("2. Delete");
                                    System.out.println("3. Search");
                                    System.out.println("4. Display");
                                    System.out.println("0. Back");
                                    System.out.print("Enter your choice: ");
                                    listChoice = in.nextInt();
                                    switch (listChoice) {
                                        // -------------------------
                                        // INSERT
                                        // -------------------------
                                        case 1:
                                            System.out.print("Enter Asset ID to insert: ");
                                            int insertID =in.nextInt();
                                            Asset insertAsset = null;
                                            for (int i = 0;i < asset.length;i++)
                                            {
                                                if (asset[i].getAssetID()== insertID) 
                                                {
                                                    insertAsset =asset[i];
                                                    break;
                                                }
                                            }
                                            if (insertAsset != null) 
                                            {
                                                watchList.insert(insertAsset);
                                                System.out.println("Asset inserted successfully."
                                                );
                                            } 
                                            else
                                            {
                                                System.out.println("Asset ID not found.");
                                            }
                                            break;
                                        // -------------------------
                                        // DELETE
                                        // -------------------------
                                        case 2:
                                            System.out.print("Enter Asset ID to delete: ");
                                            int deleteID =in.nextInt();
                                            watchList.delete(deleteID);
                                            System.out.println("Delete operation completed.");
                                            break;
                                        // -------------------------
                                        // SEARCH
                                        // -------------------------
                                        case 3:
                                            System.out.print("Enter Asset ID to search: ");
                                            int watchSearchID =in.nextInt();
                                            Asset found =watchList.search(watchSearchID);
                                            if (found != null) 
                                            {
                                                System.out.println();
                                                System.out.println("===== Asset Found =====");
                                                System.out.println("Asset ID: "+found.getAssetID());
                                                System.out.println("Asset Name: "+found.getAssetName());
                                                System.out.println("Asset Type: "+found.getAssetType());
                                                System.out.println("Current Price: "+found.getCurrentPrice());
                                            } 
                                            else
                                            {
                                                System.out.println("Asset not found.");
                                            }
                                            break;
                                        // -------------------------
                                        // DISPLAY
                                        // -------------------------
                                        case 4:
                                            System.out.println();
                                            System.out.println("===== WATCHLIST =====");
                                            watchList.display();
                                            break;
                                        // -------------------------
                                        // BACK
                                        // -------------------------
                                        case 0:
                                            System.out.println("Returning to WatchList Menu...");
                                            break;
                                        default:
                                            System.out.println("Invalid choice.");
                                    }
                                } while (listChoice != 0);
                                break;
                            // -------------------------------------
                            // BACK
                            // -------------------------------------
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (watchChoice != 0);
                    break;
                // =================================================
                // 5. CALCULATE PORTFOLIO VALUE
                // =================================================
                case 5:
                    System.out.println("==============================================");
                    System.out.println("                   PORTFOLIO                  ");
                    System.out.println("==============================================");
                
                    p.displayPortfolio(0);
                    double totalValue =p.calculateTotalValue(0);
                    System.out.println("---------------------------------");
                    System.out.println("====== TOTAL PORTFOLIO VALUE ======");
                    System.out.println("Value: "+totalValue);
                    System.out.println();
                    break;
                // =================================================
                // 6. MANAGE TRANSACTIONS
                // =================================================
                case 6:
                    int transactionChoice;
                    
                    do {
                        System.out.println();
                        System.out.println("==============================================");
                        System.out.println("           RECENT TRANSACTIONS                ");
                        System.out.println("==============================================");

                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Peek");
                        System.out.println("4. Display");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        transactionChoice = in.nextInt();
                        switch (transactionChoice) {
                            // -------------------------------------
                            // PUSH
                            // -------------------------------------
                            case 1:
                                System.out.print("Enter Transaction ID: ");
                                int transactionID =in.nextInt();
                                System.out.print("Enter Asset Name: ");
                                String transactionAsset =in.next();
                                System.out.print("Enter Transaction Type (BUY/SELL): ");
                                String transactionType =in.next();
                                System.out.print("Enter Quantity: ");
                                int transactionQuantity =in.nextInt();
                                Transaction newTransaction =new Transaction(transactionID,transactionAsset,transactionType,transactionQuantity);
                                ts.push(newTransaction);
                                System.out.println("Transaction pushed into stack successfully.");
                                break;
                            // -------------------------------------
                            // POP
                            // -------------------------------------
                            case 2:
                                Transaction pop =ts.pop();
                                if (pop != null) 
                                {
                                    System.out.println("Removed Transaction.");
                                    System.out.println("Transaction ID: "+pop.getTransactionId());
                                    System.out.println("Asset: "+pop.getAssetName());
                                    System.out.println("Type: "+pop.getTransactionType());
                                    System.out.println("Quantity: "+pop.getQuantity());
                                }
                                break;
                            // -------------------------------------
                            // PEEK
                            // -------------------------------------
                            case 3:
                                Transaction top =ts.peek();
                                if (top != null) 
                                {
                                    System.out.println("Top Transaction: ");
                                    System.out.println("Transaction ID: "+top.getTransactionId());
                                    System.out.println("Asset: "+top.getAssetName());
                                    System.out.println("Type: "+top.getTransactionType());
                                    System.out.println("Quantity: "+top.getQuantity());
                                }
                                break;
                            // -------------------------------------
                            // DISPLAY
                            // -------------------------------------
                            case 4:
                                System.out.println("===== TRANSACTION STACK =====");
                                ts.display();
                                break;
                            // -------------------------------------
                            // BACK
                            // -------------------------------------
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (transactionChoice != 0);
                    break;
                // =================================================
                // 7. MANAGE TRADING ORDERS
                // =================================================
                case 7:
                    int orderChoice;
                    
                    /*Order o1 =new Order(101,5,"Apple","BUY");
                    Order o2 =new Order(102,2,"Bitcoin","BUY");
                    Order o3 =new Order(103,3,"Tesla","SELL");
                    tq..enqueue(o1);
                    tq.enqueue(o2);
                    tq.enqueue(o3);*/
                    do {
                        System.out.println("==============================================");
                        System.out.println("          MANAGE TRADING ORDERS");
                        System.out.println("==============================================");

                        System.out.println("1. Enqueue");
                        System.out.println("2. Dequeue");
                        System.out.println("3. Peek");
                        System.out.println("4. Display");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        orderChoice = in.nextInt();
                        switch (orderChoice) {
                            // -------------------------------------
                            // ENQUEUE
                            // -------------------------------------
                            case 1:
                                System.out.print("Enter Order ID: ");
                                int orderID =in.nextInt();
                                System.out.print("Enter Quantity: ");
                                int orderQuantity =in.nextInt();
                                System.out.print("Enter Asset Name: ");
                                String orderAsset =in.next();
                                System.out.print("Enter Order Type (BUY/SELL): ");
                                String orderType =in.next();
                                Order newOrder =new Order(orderID,orderQuantity,orderAsset,orderType);
                                tq.enqueue(newOrder);
                                System.out.println("Order added to Trading Queue successfully.");
                                System.out.println("Portfolio has not changed yet.");
                                break;
                            // -------------------------------------
                            // DEQUEUE
                            // -------------------------------------
                            case 2:
                                Order remove =tq.dequeue();
                                if (remove != null) 
                                {
                                    boolean success=false;
                                    if(remove.getOrderType().equalsIgnoreCase("BUY"))
                                    {
                                        success=p.buyAsset(remove.getAssetName(),remove.getQuantity());
                                    }
                                    // -----------------------------
                                    // SELL ORDER
                                    // ----------------------------- 
                                    else if(remove.getOrderType().equalsIgnoreCase("SELL"))
                                    {
                                        success=p.sellAsset(remove.getAssetName(),remove.getQuantity());
                                    }
                                    else
                                    {
                                        System.out.println("Invalid Order Type");
                                    }
                                    
                                    if(success)
                                    {
                                        Transaction tr=new Transaction(remove.getOrderID(),remove.getAssetName(),remove.getOrderType(),remove.getQuantity());
                                        ts.push(tr);
                                        System.out.println("Order executed successfully.");
                                        System.out.println("Transaction added to Transaction Stack.");
                                    }
                                    else
                                    {
                                        System.out.println("Order was not executed.");
                                    }
                                }
                                break;
                            // -------------------------------------
                            // PEEK
                            // -------------------------------------
                            case 3:
                                Order front =tq.peek();
                                if (front != null) 
                                {
                                    System.out.println("Front Order: ");
                                    System.out.println("Order ID: "+front.getOrderID());
                                    System.out.println("Asset: "+front.getAssetName());
                                    System.out.println("Type: "+front.getOrderType());
                                    System.out.println("Quantity: "+front.getQuantity());
                                }
                                break;
                            // -------------------------------------
                            // DISPLAY
                            // -------------------------------------
                            case 4:
                                System.out.println("===== TRADING ORDER QUEUE =====");
                                tq.display();
                                break;
                            // -------------------------------------
                            // BACK
                            // -------------------------------------
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (orderChoice != 0);
                    break;
                case 0:
                    System.out.println("Thank you for using FinTech Trading Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0 to 7.");
            }
        } while (mainChoice != 0);
        in.close();
    }
}
