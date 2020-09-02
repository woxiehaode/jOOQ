/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.ddl.db.h2.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.flyway.ddl.db.h2.FlywayTest;
import org.jooq.example.flyway.ddl.db.h2.Keys;
import org.jooq.example.flyway.ddl.db.h2.tables.records.BookRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book extends TableImpl<BookRecord> {

    private static final long serialVersionUID = 1583971749;

    /**
     * The reference instance of <code>FLYWAY_TEST.BOOK</code>
     */
    public static final Book BOOK = new Book();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookRecord> getRecordType() {
        return BookRecord.class;
    }

    /**
     * The column <code>FLYWAY_TEST.BOOK.ID</code>.
     */
    public final TableField<BookRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.BOOK.AUTHOR_ID</code>.
     */
    public final TableField<BookRecord, Integer> AUTHOR_ID = createField(DSL.name("AUTHOR_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLYWAY_TEST.BOOK.TITLE</code>.
     */
    public final TableField<BookRecord, String> TITLE = createField(DSL.name("TITLE"), SQLDataType.VARCHAR(400).nullable(false), this, "");

    private Book(Name alias, Table<BookRecord> aliased) {
        this(alias, aliased, null);
    }

    private Book(Name alias, Table<BookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>FLYWAY_TEST.BOOK</code> table reference
     */
    public Book(String alias) {
        this(DSL.name(alias), BOOK);
    }

    /**
     * Create an aliased <code>FLYWAY_TEST.BOOK</code> table reference
     */
    public Book(Name alias) {
        this(alias, BOOK);
    }

    /**
     * Create a <code>FLYWAY_TEST.BOOK</code> table reference
     */
    public Book() {
        this(DSL.name("BOOK"), null);
    }

    public <O extends Record> Book(Table<O> child, ForeignKey<O, BookRecord> key) {
        super(child, key, BOOK);
    }

    @Override
    public Schema getSchema() {
        return FlywayTest.FLYWAY_TEST;
    }

    @Override
    public UniqueKey<BookRecord> getPrimaryKey() {
        return Keys.PK_T_BOOK;
    }

    @Override
    public List<UniqueKey<BookRecord>> getKeys() {
        return Arrays.<UniqueKey<BookRecord>>asList(Keys.PK_T_BOOK);
    }

    @Override
    public List<ForeignKey<BookRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookRecord, ?>>asList(Keys.FK_T_BOOK_AUTHOR_ID);
    }

    public Author author() {
        return new Author(this, Keys.FK_T_BOOK_AUTHOR_ID);
    }

    @Override
    public Book as(String alias) {
        return new Book(DSL.name(alias), this);
    }

    @Override
    public Book as(Name alias) {
        return new Book(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Book rename(String name) {
        return new Book(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Book rename(Name name) {
        return new Book(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
