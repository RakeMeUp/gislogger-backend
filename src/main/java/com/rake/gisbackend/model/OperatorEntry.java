package com.rake.gisbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
// eliminates user info repeating in entry
Table gis.operator_entry{
  entry_id int [ref: - gis.entry.entry_id]
  operator int [ref: - gis.user.user_id]
}
*/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "operatorEntry")
public class OperatorEntry {
    @Id
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "operatorId")
    private Operator operator;

    @Id
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "entryId")
    private Entry entry;
}
