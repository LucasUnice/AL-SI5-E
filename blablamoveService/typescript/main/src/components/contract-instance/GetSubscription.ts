import {Subscribe} from "../../entity/Subscribe";
import { Customer } from "../../entity/customer/Customer";

export interface GetSubscription {
    getSubscriptions() : Array<Subscribe>;
    getSubscriptionById(id: string): Subscribe;
    getSubscriptionByCustomer(customer: Customer): Array<Subscribe>;
}