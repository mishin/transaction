/*
 * This file is generated by jOOQ.
*/
package com.alekseysamoylov.db.transaction;


import com.alekseysamoylov.db.transaction.tables.Product;
import com.alekseysamoylov.db.transaction.tables.Store;
import com.alekseysamoylov.db.transaction.tables.records.ProductRecord;
import com.alekseysamoylov.db.transaction.tables.records.StoreRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ProductRecord, Integer> IDENTITY_PRODUCT = Identities0.IDENTITY_PRODUCT;
    public static final Identity<StoreRecord, Integer> IDENTITY_STORE = Identities0.IDENTITY_STORE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ProductRecord> PRODUCT_PKEY = UniqueKeys0.PRODUCT_PKEY;
    public static final UniqueKey<StoreRecord> STORE_PKEY = UniqueKeys0.STORE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ProductRecord, Integer> IDENTITY_PRODUCT = Internal.createIdentity(Product.PRODUCT, Product.PRODUCT.ID);
        public static Identity<StoreRecord, Integer> IDENTITY_STORE = Internal.createIdentity(Store.STORE, Store.STORE.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ProductRecord> PRODUCT_PKEY = Internal.createUniqueKey(Product.PRODUCT, "product_pkey", Product.PRODUCT.ID);
        public static final UniqueKey<StoreRecord> STORE_PKEY = Internal.createUniqueKey(Store.STORE, "store_pkey", Store.STORE.ID);
    }
}
