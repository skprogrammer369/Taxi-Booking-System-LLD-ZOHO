/*
===========================================
🚕 TAXI BOOKING SYSTEM - PROBLEM STATEMENT
===========================================

Q1) Design a Taxi Booking application where customers can book taxis 
available at certain points in a linear route.

-----------------------
PROBLEM ASSUMPTIONS
-----------------------
1. Taxi Count:
   - Assume 4 taxis for simplicity.
   - The system should be scalable to handle any number of taxis.

2. Points on Route:
   - A, B, C, D, E, F
   - Each point is 15 kms apart.

3. Travel Time:
   - Travel time between any two consecutive points is 60 minutes.

-----------------------
CHARGES
-----------------------
- Minimum fare: Rs.100 for the first 5 kms.
- Rs.10 per km thereafter.

-----------------------
INITIAL TAXI POSITION
-----------------------
- All taxis start at point A.

-----------------------
BOOKING RULES
-----------------------
1. When a customer books a taxi:
   - A free taxi at the pickup point is allocated first.

2. If no taxi is available at the pickup point:
   - The nearest free taxi is allocated.

3. If two taxis are free at the same point:
   - The taxi with lower total earnings is allocated.

4. Taxis only charge for the distance between:
   - Pickup point → Drop point.

5. If no taxis are free:
   - The booking is rejected.

-----------------------
NOTE
-----------------------
- The program should handle multiple bookings sequentially.
- It should update each taxi’s location, free time, and earnings accordingly.
*/
