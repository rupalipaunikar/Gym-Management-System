package com.gms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "admin")
public class Admin extends Employee {
}
