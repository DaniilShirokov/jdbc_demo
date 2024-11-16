select c."name" ,c.surname, o.product_name
from public.orders o
inner join public.customers c on o.customer_id = c.id
WHERE c.name = :name;

