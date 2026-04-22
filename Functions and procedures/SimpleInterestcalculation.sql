CREATE OR REPLACE FUNCTION calculate_si(p NUMERIC, r NUMERIC, t NUMERIC)
RETURNS NUMERIC AS $$
DECLARE
    si NUMERIC;
BEGIN
    si := (p * r * t) / 100;
    RETURN si;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE PROCEDURE calculate_amount(p NUMERIC, r NUMERIC, t NUMERIC)
LANGUAGE plpgsql
AS $$
DECLARE
    si NUMERIC;
    total NUMERIC;
BEGIN
    -- Call function
    si := calculate_si(p, r, t);

    -- Calculate total amount
    total := p + si;

    -- Display output
    RAISE NOTICE 'Principal Amount : %', p;
    RAISE NOTICE 'Simple Interest  : %', si;
    RAISE NOTICE 'Total Amount     : %', total;
END;
$$;
CALL calculate_amount(10000, 5, 2);