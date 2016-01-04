/**
 * Copyright (c) 2015-2016 John Whitbeck. All rights reserved.
 *
 * The use and distribution terms for this software are covered by the
 * Apache License 2.0 (https://www.apache.org/licenses/LICENSE-2.0.txt)
 * which can be found in the file al-v20.txt at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by
 * the terms of this license.
 *
 * You must not remove this notice, or any other, from this software.
 */

package net.whitbeck.rdb_parser;

/**
 * This enum holds the three types of entries that the {@link RdbParser} can read from a RDB file.
 *
 * @author John Whitbeck
 */
public enum EntryType {

  /**
   * Denotes an end-of-file entry with a checksum. These entries are marked by a 0xff byte in the RDB file.
   *
   * @see Eof
   */
  EOF,

  /**
   * Denotes a DB selection entry. These entries are marked by a 0xfe byte in the RDB file.
   *
   * @see DbSelect
   */
  DB_SELECT,

  /**
   * Denotes a key/value pair entry that may optionally have an expiry. In the RDB file, these entries are
   * marked by a 0xfd byte (expiry timestamp in seconds), a 0xfc byte (expiry time in milliseconds), or no
   * marker (no expiry).
   *
   * @see KeyValuePair
   */
  KEY_VALUE_PAIR;
}
