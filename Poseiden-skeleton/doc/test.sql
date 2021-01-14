select id, name, string_agg(prestataire,'') as prestataire,  string_agg(domaine, '') as domaine, string_agg(tma,'') as tma, 0 correspondant,
       '' sourcegitflag, '' excel
from (
         select A.id, A.name, '' prestataire, D.name domaine, tma, 0, '',''
         from  application_man A
                   left join link_app_domaine lad on lad.id_app=A.id
                   left join domaine  D on D.id = lad.id_domaine
         union
         select A.id, A.name, '' prestataire, '' domaine ,T.name tma, 0, '',''
         from  application_man A
                   left join link_app_tma lat on lat.id_app=A.id
                   left join tma T on T.id = lat.id_tma
         union
         select A.id, A.name, P.name prestataire, '' domaine ,'' tma, 0, '',''
         from  application_man A
                   left join link_app_presta lap on lap.id_app=A.id
                   left join prestataire P on P.id = lap.id_prestataire ) as gg
group by id, name
order by name