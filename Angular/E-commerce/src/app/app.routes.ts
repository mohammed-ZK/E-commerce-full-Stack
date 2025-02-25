import { Routes } from '@angular/router';

export const routes: Routes = [
  { path: 'products', loadChildren: () => import('./features/products/products.module').then(m => m.ProductsModule) },
    { path: 'users', loadChildren: () => import('./features/users/users.module').then(m => m.UsersModule) },
    { path: '', redirectTo: '/products', pathMatch: 'full' },
    { path: '**', redirectTo: '/products' }
  ];
