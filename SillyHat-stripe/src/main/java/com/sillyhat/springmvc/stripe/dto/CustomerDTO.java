package com.sillyhat.springmvc.stripe.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * CustomerDTO
 * https://stripe.com/docs/api/java#customer_object
 * @author 徐士宽
 * @date 2017/8/6 21:50
 */
public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 8718336376807047815L;

    /**
     * Unique identifier for the object.
     */
    private String id;

    /**
     * String representing the object’s type. Objects of the same type share the same value.
     */
    private String object;

    /**
     * Current balance, if any, being stored on the customer’s account.
     * If negative, the customer has credit to apply to the next invoice.
     * If positive, the customer has an amount owed that will be added to the next invoice.
     * The balance does not refer to any unpaid invoices;
     * it solely takes into account amounts that have yet to be successfully applied to any invoice.
     * This balance is only taken into account for recurring billing purposes (i.e., subscriptions, invoices, invoice items).
     */
    private Integer account_balance;

    /**
     * The customer’s VAT identification number.
     */
    private String business_vat_id;

    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    private Date created;

    /**
     * Three-letter ISO code for the currency the customer can be charged in for recurring billing purposes.
     * https://stripe.com/docs/currencies
     */
    private String currency;

    /**
     * ID of the default source attached to this customer.
     */
    private String default_source;

    /**
     * Whether or not the latest charge for the customer’s latest invoice has failed.
     */
    private boolean delinquent;

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    private String description;

    /**
     * Describes the current discount active on the customer, if there is one.
     */
    private HashMap discount;

    /**
     * The customer’s email address.
     */
    private String email;

    /**
     * Flag indicating whether the object exists in live mode or test mode.
     */
    private boolean livemode;

    /**
     * Set of key/value pairs that you can attach to an object.
     * It can be useful for storing additional information about the object in a structured format.
     */
    private HashMap metadata;

    /**
     * Shipping information associated with the customer.
     */
    private HashMap shipping;

    /**
     * The customer’s payment sources, if any.
     */
    private List sources;

    /**
     * The customer’s current subscriptions, if any.
     */
    private List subscriptions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(Integer account_balance) {
        this.account_balance = account_balance;
    }

    public String getBusiness_vat_id() {
        return business_vat_id;
    }

    public void setBusiness_vat_id(String business_vat_id) {
        this.business_vat_id = business_vat_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDefault_source() {
        return default_source;
    }

    public void setDefault_source(String default_source) {
        this.default_source = default_source;
    }

    public boolean isDelinquent() {
        return delinquent;
    }

    public void setDelinquent(boolean delinquent) {
        this.delinquent = delinquent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap getDiscount() {
        return discount;
    }

    public void setDiscount(HashMap discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLivemode() {
        return livemode;
    }

    public void setLivemode(boolean livemode) {
        this.livemode = livemode;
    }

    public HashMap getMetadata() {
        return metadata;
    }

    public void setMetadata(HashMap metadata) {
        this.metadata = metadata;
    }

    public HashMap getShipping() {
        return shipping;
    }

    public void setShipping(HashMap shipping) {
        this.shipping = shipping;
    }

    public List getSources() {
        return sources;
    }

    public void setSources(List sources) {
        this.sources = sources;
    }

    public List getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List subscriptions) {
        this.subscriptions = subscriptions;
    }
}
